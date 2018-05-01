package com.courseproject.service;

import com.courseproject.dao.AutoInfDao;
import com.courseproject.entity.AutoInf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutoInfImpl implements AutoInfService {

    @Autowired
    public AutoInfDao autoInfDao;

    @Override
    public void save(AutoInf autoInf) {
            autoInfDao.save(autoInf);
    }
}
