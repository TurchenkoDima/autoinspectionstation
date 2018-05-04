package com.courseproject.service;

import com.courseproject.entity.TestError;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface TestSystemService {

    void saveBrakeSystem (int autoId) throws IOException, SAXException;
    List<TestError> getBrakeErrorsByAutoId (int id);
}
