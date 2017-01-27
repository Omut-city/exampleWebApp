package com.omut.exampleWebApp.model;

import com.omut.exampleWebApp.dao.Airplane;
import com.omut.exampleWebApp.dao.AirplaneMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;

public class Select {
    private JdbcTemplate jdbcTemplate;

    public Select(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Airplane> select () {
        String request = "SELECT * FROM airplane;";
        return jdbcTemplate.query(request, new AirplaneMapper());
    }

    public Airplane selectById (int id) {
        return jdbcTemplate.queryForObject( "SELECT * FROM airplane WHERE id = ?",
                new Object[]{id}, new AirplaneMapper() );
    }
}
