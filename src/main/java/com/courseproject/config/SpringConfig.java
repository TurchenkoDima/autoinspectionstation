package com.courseproject.config;

import com.courseproject.dao.AutoInfDao;
import com.courseproject.dao.AutoInfDaoImpl;
import com.courseproject.dao.TechEngineerDao;
import com.courseproject.dao.TechEngineerDaoImpl;
import com.courseproject.entity.AutoInf;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {


    @Bean
    public JdbcTemplate getJdbcTemplate(){
        return new JdbcTemplate(getDataSource());
    }

    @Bean
    public DataSource getDataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/sto?useSll=false");
        dataSource.setUsername("root");
        dataSource.setPassword("admin");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return dataSource;
    }

    @Bean
    public TechEngineerDao getTechEngineerDao(){
        return new TechEngineerDaoImpl(getJdbcTemplate());
    }

    @Bean
    public AutoInfDao getAutoInfDao(){
        return new AutoInfDaoImpl(getJdbcTemplate());

    }

}
