package com.courseproject.service;

import com.courseproject.entity.AutoInf;

import java.util.List;

public interface AutoInfService {

    void save (AutoInf autoInf);

    List<AutoInf> findAll();

    AutoInf getById(int id);
}
