package com.example.exam8.dao;

import com.example.exam8.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserDao {

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    private final JdbcTemplate jdbcTemplate;

    public void registerUser(User user) {
        String sql = """
                insert into users(email, password, enabled) 
                VALUES (:email, :password, :enabled)
                """;

        namedParameterJdbcTemplate.update(sql, new MapSqlParameterSource()
                .addValue("email", user.getEmail())
                .addValue("password", user.getPassword())
                .addValue("enabled", user.getEnabled()));
    }


    public Long returnIdByEmail(String email) {
        String sql = """
                select id from users
                where email like ?
                """;

        return jdbcTemplate.queryForObject(sql, Long.class, email);
    }

}
