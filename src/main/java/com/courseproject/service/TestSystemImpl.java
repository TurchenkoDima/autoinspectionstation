package com.courseproject.service;

import com.courseproject.dao.TestSystemsDao;
import com.courseproject.entity.*;
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

    @Autowired
    public Engine engineSystem;

    @Autowired
    public Exhaust exhaustSystem;

    @Autowired
    public Headlamps headlampsSystem;

    @Autowired
    public Rudder rudderSystem;

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

    @Override
    public void saveEngineSystem(int autoId) throws IOException, SAXException {
        engineSystem.toDoTest();
        for (int i = 0; i < engineSystem.getGeneratedErrors().size(); i++)
            testSystemsDao.saveEngineSystem(autoId,  engineSystem.getGeneratedErrors().get(i));
    }

    @Override
    public List<TestError> getEngineErrorsByAutoId(int id) {
        return testSystemsDao.getEngineErrorsByAutoId(id);
    }

    @Override
    public void saveExhaustSystem(int autoId) throws IOException, SAXException {
        exhaustSystem.toDoTest();
        for (int i = 0; i < exhaustSystem.getGeneratedErrors().size(); i++)
            testSystemsDao.saveExhaustSystem(autoId,  exhaustSystem.getGeneratedErrors().get(i));
    }

    @Override
    public List<TestError> getExhaustErrorsByAutoId(int id) {
        return testSystemsDao.getExhaustErrorsByAutoId(id);
    }

    @Override
    public void saveHeadlampsSystem(int autoId) throws IOException, SAXException {
        headlampsSystem.toDoTest();
        for (int i = 0; i < headlampsSystem.getGeneratedErrors().size(); i++)
            testSystemsDao.saveHeadlampsSystem(autoId,  headlampsSystem.getGeneratedErrors().get(i));
    }

    @Override
    public List<TestError> getHeadlampsErrorsByAutoId(int id) {
        return testSystemsDao.getHeadlampsErrorsByAutoId(id);
    }

    @Override
    public void saveRudderSystem(int autoId) throws IOException, SAXException {
        rudderSystem.toDoTest();
        for (int i = 0; i < rudderSystem.getGeneratedErrors().size(); i++)
            testSystemsDao.saveHeadlampsSystem(autoId,  rudderSystem.getGeneratedErrors().get(i));
    }

    @Override
    public List<TestError> getRudderErrorsByAutoId(int id) {
        return testSystemsDao.getRudderErrorsByAutoId(id);
    }
}
