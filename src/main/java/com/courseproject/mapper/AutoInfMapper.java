package com.courseproject.mapper;

import com.courseproject.entity.AutoInf;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AutoInfMapper implements RowMapper<AutoInf> {

    @Override
    public AutoInf mapRow(ResultSet resultSet, int i) throws SQLException {
        AutoInf autoInf = new AutoInf();
        autoInf.setId(resultSet.getInt("id"));
        autoInf.setOwner(resultSet.getString("owner"));
        autoInf.setRegistrationPlate(resultSet.getString("registrationPlate"));
        autoInf.setModel(resultSet.getString("model"));
        autoInf.setYearOfManufacture(resultSet.getString("yearOfManufacture"));
        autoInf.setColor(resultSet.getString("color"));
        autoInf.setType(resultSet.getString("type"));
        autoInf.setCategory(resultSet.getString("category"));
        autoInf.setEngineType(resultSet.getString("engineType"));
        autoInf.setEcoClass(resultSet.getInt("ecoClass"));
        autoInf.setNumberOfaxles(resultSet.getInt("numberOfaxles"));
        autoInf.setBrakeSystem(resultSet.getString("brakeSystem"));
        return autoInf;
    }
}
