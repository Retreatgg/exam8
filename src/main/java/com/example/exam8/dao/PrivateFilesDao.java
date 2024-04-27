package com.example.exam8.dao;

import com.example.exam8.model.PrivateFile;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class PrivateFilesDao {

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    private final JdbcTemplate jdbcTemplate;

    public void createPrivateFile(PrivateFile privateFile) {
        String sql = """
                insert into PRIVATE_FILES(file_name, link_name, enabled) 
                VALUES (:file_name, :link_name, :enabled)
                """;

        namedParameterJdbcTemplate.update(sql, new MapSqlParameterSource()
                .addValue("file_name", privateFile.getFileName())
                .addValue("link_name", privateFile.getLinkName())
                .addValue("enabled", privateFile.getEnabled()));
    }


    public void changeStatusLink(PrivateFile privateFile) {
        String sql = """
                update private_files
                set ENABLED = false
                where ID = ?;
                """;

        jdbcTemplate.update(sql, privateFile.getId());
    }

    public Optional<PrivateFile> getIdByName(String linkName) {
        String sql = """
                select * from PRIVATE_FILES
                where LINK_NAME like ?
                and ENABLED = true;
                """;

        return Optional.ofNullable(
                DataAccessUtils.singleResult(
                        jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(PrivateFile.class), linkName)
                )
        );
    }
}
