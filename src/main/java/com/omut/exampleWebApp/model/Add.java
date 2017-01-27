package com.omut.exampleWebApp.model;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

public class Add {
    private JdbcTemplate jdbcTemplate;

    public Add(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public String add (HttpServletRequest params) throws UnsupportedEncodingException {
            params.setCharacterEncoding("UTF8");

        try {
                String request = "INSERT INTO airplane (" +
                        "id, " +
                        "type, " +
                        "manufacturer, " +
                        "number_engines, " +
                        "range_distance, " +
                        "cruise_speed, " +
                        "passenger_capacity" +
                        ") VALUES (" +
                        params.getParameter("id") + ", '" +
                        params.getParameter("type") + "', '" +
                        params.getParameter("manufacturer") + "',  " +
                        params.getParameter("number_engines") + ", " +
                        params.getParameter("range_distance") + ", " +
                        params.getParameter("cruise_speed") + ", " +
                        params.getParameter("passenger_capacity") + ")";

            jdbcTemplate.execute(request);
            return "Data added into table";
        } catch (Exception e) {
            return "Add into table failed due to: " + e;
        }
    }
}
