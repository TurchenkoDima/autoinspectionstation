package com.courseproject.dao;

import com.courseproject.entity.TechEngineer;

import java.util.List;

public interface TechEngineerDao {


    void save (TechEngineer techEngineer);

    TechEngineer getById(int id);

    List<TechEngineer> findAll();

    void delete (int id);

    void update (TechEngineer techEngineer);

}
