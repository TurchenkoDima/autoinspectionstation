package com.courseproject.dao;

import com.courseproject.entity.AutoInf;
import com.courseproject.mapper.AutoInfMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class AutoInfDaoImpl implements AutoInfDao {

    public final JdbcTemplate jdbcTemplate;

    @Autowired
    public AutoInfDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void save(AutoInf autoInf) {
        String sql = "INSERT INTO autoinf (owner, registrationPlate, model, yearOfManufacture, color, type, category, engineType, ecoClass, numberOfaxles, brakeSystem) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, autoInf.getOwner(), autoInf.getRegistrationPlate(), autoInf.getModel(), autoInf.getYearOfManufacture(),
                autoInf.getColor(), autoInf.getType(), autoInf.getCategory(), autoInf.getEngineType(), autoInf.getEcoClass(), autoInf.getNumberOfaxles(),
                autoInf.getBrakeSystem());
    }

    @Override
    public List<AutoInf> findAll() {
        String sql = "SELECT * FROM autoinf";
        return jdbcTemplate.query(sql, new AutoInfMapper());
    }

    @Override
    public AutoInf getById(int id) {
        String sql = "SELECT * FROM autoinf WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new AutoInfMapper(), id);
    }
}
