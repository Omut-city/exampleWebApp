package com.omut.exampleWebApp.model;

import org.springframework.jdbc.core.JdbcTemplate;

public class Insert {
    private JdbcTemplate jdbcTemplate;

    public Insert(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public String insert () {
        try {
            jdbcTemplate.execute("DELETE FROM airplane");
            String request = "INSERT INTO airplane (" +
                    "id, type, manufacturer, number_engines, range_distance, " +
                    "cruise_speed, passenger_capacity) VALUES " +
                    "('1', 'A-300', 'Airbus Industry', '2', '6000', '820', '230'), " +
                    "('2', 'A-310', 'Airbus Industry', '2', '9000', '810', '250'), " +
                    "('3', 'A-318', 'Airbus Industry', '2', '5000', '800', '110'), " +
                    "('4', 'A-319', 'Airbus Industry', '2', '5500', '820', '120'), " +
                    "('5', 'A-320', 'Airbus Industry', '2', '6100', '810', '140'), " +
                    "('6', 'A-321', 'Airbus Industry', '2', '6500', '820', '180'), " +
                    "('7', 'A-330', 'Airbus Industry', '2', '13000', '800', '250'), " +
                    "('8', 'A-340', 'Airbus Industry', '4', '14500', '820', '260'), " +
                    "('9', 'A-380', 'Airbus Industry', '2', '15000', '810', '550'), " +
                    "('10', 'B-707', 'Boeing Corporation', '4', '8000', '820', '140'), " +
                    "('11', 'B-717', 'Boeing Corporation', '2', '4800', '820', '180'), " +
                    "('12', 'B-727', 'Boeing Corporation', '2', '5500', '800', '120'), " +
                    "('13', 'B-737', 'Boeing Corporation', '2', '6000', '820', '160'), " +
                    "('14', 'B-747', 'Boeing Corporation', '4', '13000', '810', '450'), " +
                    "('15', 'B-757', 'Boeing Corporation', '2', '9000', '820', '210'), " +
                    "('16', 'B-767', 'Boeing Corporation', '2', '11000', '800', '280'), " +
                    "('17', 'B-777', 'Boeing Corporation', '2', '12000', '810', '330'), " +
                    "('18', 'B-787', 'Boeing Corporation', '2', '14000', '820', '180');";
            jdbcTemplate.execute(request);
            return "Data inserted into table";
        } catch (Exception e) {
            return "Insert into table failed due to: " + e;
        }
    }
}
