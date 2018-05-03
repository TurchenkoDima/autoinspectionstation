package com.courseproject.service;

import com.courseproject.dao.TechEngineerDao;
import com.courseproject.entity.TechEngineer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechEngineerImpl implements TechEngineerService {

    @Autowired
    public TechEngineerDao techEngineerDao;

    @Override
    public void save(TechEngineer techEngineer) {
        techEngineerDao.save(techEngineer);
    }

    @Override
    public TechEngineer getById(int id) {
        return techEngineerDao.getById(id);
    }

    @Override
    public TechEngineer getByLogin(String login) { return techEngineerDao.getByLogin(login); }


    @Override
    public List<TechEngineer> findAll() {
        return techEngineerDao.findAll();
    }

    @Override
    public void delete(int id) {
        techEngineerDao.delete(id);
    }

    @Override
    public void update(TechEngineer techEngineer) {
        techEngineerDao.update(techEngineer);
    }
}
