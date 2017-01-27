package com.omut.exampleWebApp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class AirplaneMapper implements RowMapper<Airplane> {
    public Airplane mapRow(ResultSet rs, int rowNum) throws SQLException {
        Airplane airplane = new Airplane();
        airplane.setId(Integer.parseInt (rs.getString("id")));
        airplane.setType(rs.getString("type"));
        airplane.setManufacturer(rs.getString("manufacturer"));
        airplane.setNumber_engines(Integer.parseInt (rs.getString("number_engines")));
        airplane.setPassenger_capacity(Integer.parseInt (rs.getString("passenger_capacity")));
        airplane.setCruise_speed(Integer.parseInt (rs.getString("cruise_speed")));
        airplane.setRange_distance(Integer.parseInt (rs.getString("range_distance")));
        return airplane;
    }
}