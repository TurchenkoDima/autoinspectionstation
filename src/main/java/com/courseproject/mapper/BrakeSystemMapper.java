package com.courseproject.mapper;
import com.courseproject.entity.TestError;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BrakeSystemMapper implements RowMapper<TestError> {

    @Override
    public TestError mapRow(ResultSet resultSet, int i) throws SQLException {
        TestError testError = new TestError();
        testError.setError((resultSet.getString("error")));
        return testError;
    }
}
