package com.courseproject.dao;

import com.courseproject.entity.TestError;

import java.util.ArrayList;
import java.util.List;

public interface TestSystemsDao {

    void saveBrakeSystem (int autoId, String error);
    List<TestError> getBrakeErrorsByAutoId (int id);
}
