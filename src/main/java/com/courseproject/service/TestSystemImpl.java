package com.courseproject.service;

import com.courseproject.dao.TestSystemsDao;
import com.courseproject.entity.BreakSystem;
import com.courseproject.entity.TestError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class TestSystemImpl implements TestSystemService {

    @Autowired
    public TestSystemsDao testSystemsDao;

    @Autowired
    public BreakSystem breakSystem;

    @Override
    public void saveBrakeSystem(int autoId) throws IOException, SAXException {
        breakSystem.toDoTest();
        for (int i = 0; i < breakSystem.getGeneratedErrors().size(); i++)
            testSystemsDao.saveBrakeSystem(autoId, breakSystem.getGeneratedErrors().get(i));
    }

    @Override
    public List<TestError> getBrakeErrorsByAutoId(int id) {
        return testSystemsDao.getBrakeErrorsByAutoId(id);
    }
}
