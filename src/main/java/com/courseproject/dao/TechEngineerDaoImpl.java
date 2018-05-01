package com.courseproject.dao;

import com.courseproject.entity.TechEngineer;
import com.courseproject.mapper.TechEngineerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class TechEngineerDaoImpl implements TechEngineerDao {

    public final JdbcTemplate jdbcTemplate;

    @Autowired
    public TechEngineerDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void save(TechEngineer techEngineer) {
        String sql = "INSERT INTO techengineers (te_name, te_surname, te_fathersname) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, techEngineer.getName(), techEngineer.getSurname(), techEngineer.getFathersName());
    }

    @Override
    public TechEngineer getById(int id) {
        String sql = "SELECT * FROM techengineers WHERE te_id = ?";
        return jdbcTemplate.queryForObject(sql, new TechEngineerMapper(), id);
    }

    @Override
    public List<TechEngineer> findAll() {
        String sql = "SELECT * FROM techengineers";
        return jdbcTemplate.query(sql, new TechEngineerMapper());
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM techengineers WHERE te_id=?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public void update(TechEngineer techEngineer) {
        String sql = "UPDATE techengineers SET te_name=?, te_surname=?, te_fathersname=? WHERE te_id=?";
        jdbcTemplate.update(sql, techEngineer.getName(), techEngineer.getSurname(), techEngineer.getFathersName(), techEngineer.getId());
        System.out.println(techEngineer.getId());
    }
}
