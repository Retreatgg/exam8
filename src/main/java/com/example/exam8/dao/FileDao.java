package com.example.exam8.dao;

import com.example.exam8.model.File;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class FileDao {

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    private final JdbcTemplate jdbcTemplate;


    public void createFile(File file) {
        String sql = """
                insert into files(name, file_name, author_id, status) 
                VALUES ( :name, :file_name, :author_id, :status )
                """;

        namedParameterJdbcTemplate.update(sql, new MapSqlParameterSource()
                        .addValue("name", file.getName())
                .addValue("file_name", file.getFileName())
                .addValue("author_id", file.getAuthorId())
                .addValue("status", file.getStatus()));
    }

    public List<File> getFiles() {
        String sql = """
                select * from files
                where status like 'PUBLIC'
                """;

        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(File.class));
    }

    public Optional<File> getFileById(Long id ) {
        String sql = """
                select id, name, file_name, author_id, status from files where id = ?
                """;

        return Optional.ofNullable(
                DataAccessUtils.singleResult(
                        jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(File.class), id)
                )
        );
    }
}
