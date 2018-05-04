package com.courseproject.dao;

import com.courseproject.entity.TestError;
import com.courseproject.mapper.BrakeSystemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

public class TestSystemsImpl implements TestSystemsDao {

    public final JdbcTemplate jdbcTemplate;

    @Autowired
    public TestSystemsImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void saveBrakeSystem(int autoId, String error) {
        String sql = "INSERT INTO brakesystemerrors (id_autoinf, error) VALUES (?, ?)";
        jdbcTemplate.update(sql, autoId, error);
    }

    @Override
    public List<TestError> getBrakeErrorsByAutoId(int id) {
        String sql = "SELECT * FROM brakesystemerrors WHERE id_autoinf = " + "'" + id + "'";
        return jdbcTemplate.query(sql, new BrakeSystemMapper());
    }
}
