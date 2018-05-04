package com.courseproject.service;

import com.courseproject.entity.TestError;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface TestSystemService {

    void saveBrakeSystem (int autoId) throws IOException, SAXException;
    List<TestError> getBrakeErrorsByAutoId (int id);

    void saveEngineSystem (int autoId) throws IOException, SAXException;
    List<TestError> getEngineErrorsByAutoId (int id);

    void saveExhaustSystem (int autoId) throws IOException, SAXException;
    List<TestError> getExhaustErrorsByAutoId (int id);

    void saveHeadlampsSystem (int autoId) throws IOException, SAXException;
    List<TestError> getHeadlampsErrorsByAutoId (int id);

    void saveRudderSystem (int autoId) throws IOException, SAXException;
    List<TestError> getRudderErrorsByAutoId (int id);
}
