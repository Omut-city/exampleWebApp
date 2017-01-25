package com.omut.exampleWebApp.model;

import org.springframework.jdbc.core.JdbcTemplate;

public class Select {
    private JdbcTemplate jdbcTemplate;

    public Select(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public String select () {
        try {
            String request = "SELECT * FROM airplane";
            jdbcTemplate.execute(request);
            return "Data selected from table";
        } catch (Exception e) {
            return "Select from table failed due to: " + e;
        }
    }
}
