package com.omut.exampleWebApp.config.application;

import com.omut.exampleWebApp.model.Add;
import com.omut.exampleWebApp.model.Create;
import com.omut.exampleWebApp.model.Insert;
import com.omut.exampleWebApp.model.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource(value = {"classpath:util.properties"})
public class AppConfig {
    @Autowired
    Environment environment;

    @Bean
    public DriverManagerDataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(environment.getProperty("jdbc.postgresql.driverClass"));
        dataSource.setUrl(environment.getProperty("jdbc.postgresql.url"));
        dataSource.setUsername(environment.getProperty("jdbc.postgresql.username"));
        dataSource.setPassword(environment.getProperty("jdbc.postgresql.password"));
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }

    @Bean
    public Create create () {
        return new Create(jdbcTemplate());
    }

    @Bean
    public Insert insert () {
        return new Insert(jdbcTemplate());
    }

    @Bean
    public Select select () {
        return new Select(jdbcTemplate());
    }

    @Bean
    public Add add () {
        return new Add(jdbcTemplate());
    }
}
