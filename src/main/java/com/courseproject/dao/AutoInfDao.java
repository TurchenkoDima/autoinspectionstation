package com.courseproject.dao;

import com.courseproject.entity.AutoInf;

import java.util.List;

public interface AutoInfDao {

    void save (AutoInf autoInf);

    List<AutoInf> findAll();

    AutoInf getById(int id);
}
