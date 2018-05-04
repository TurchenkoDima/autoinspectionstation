package com.courseproject.dao;

import com.courseproject.entity.TestError;

import java.util.ArrayList;
import java.util.List;

public interface TestSystemsDao {

    void saveBrakeSystem (int autoId, String error);
    List<TestError> getBrakeErrorsByAutoId (int id);

    void saveEngineSystem (int autoId, String error);
    List<TestError> getEngineErrorsByAutoId (int id);

    void saveExhaustSystem (int autoId, String error);
    List<TestError> getExhaustErrorsByAutoId (int id);

    void saveHeadlampsSystem (int autoId, String error);
    List<TestError> getHeadlampsErrorsByAutoId (int id);

    void saveRudderSystem (int autoId, String error);
    List<TestError> getRudderErrorsByAutoId (int id);

}
