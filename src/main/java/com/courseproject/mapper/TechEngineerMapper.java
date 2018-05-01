package com.courseproject.mapper;

import com.courseproject.entity.TechEngineer;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class TechEngineerMapper implements RowMapper<TechEngineer> {


    // Для каждого ряда, который jdbcTemplate будет доставать из
    //базы данных мы создаём инженера и устанавливаем его параметры.
    @Override
    public TechEngineer mapRow(ResultSet resultSet, int i) throws SQLException {
        TechEngineer techEngineer = new TechEngineer();
        techEngineer.setId(resultSet.getInt("te_id"));
        techEngineer.setName(resultSet.getString("te_name"));
        techEngineer.setSurname(resultSet.getString("te_surname"));
        techEngineer.setFathersName(resultSet.getString("te_fathersname"));
        techEngineer.setLogin(resultSet.getString("te_login"));
        techEngineer.setPassword(resultSet.getString("te_password"));
        return techEngineer;
    }
}
