package com.omut.exampleWebApp.model;

import org.springframework.jdbc.core.JdbcTemplate;

public class Create {
    private JdbcTemplate jdbcTemplate;

    public Create(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public String create () {
        try {
            jdbcTemplate.execute("DROP TABLE IF EXISTS airplane");
            String request = "CREATE TABLE airplane (id integer NOT NULL PRIMARY KEY, " +
                    "type varchar (100) NOT NULL, " +
                    "manufacturer varchar (100) NOT NULL, " +
                    "number_engines integer NOT NULL, " +
                    "range_distance integer NOT NULL, " +
                    "cruise_speed integer NOT NULL, " +
                    "passenger_capacity integer NOT NULL);";
            jdbcTemplate.execute(request);
            return "Table created";
        } catch (Exception e) {
            return "Create of table failed due to: " + e;
        }
    }
}

