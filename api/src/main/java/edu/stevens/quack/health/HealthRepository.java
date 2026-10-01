package edu.stevens.quack.health;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class HealthRepository {

    private final JdbcTemplate jdbc;

    public HealthRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public boolean isDatabaseUp() {
        try {
            return Integer.valueOf(1).equals(jdbc.queryForObject("select 1", Integer.class));
        } catch (DataAccessException e) {
            return false;
        }
    }
}
