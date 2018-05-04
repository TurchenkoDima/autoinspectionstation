package com.courseproject.entity;

import com.courseproject.parser.ParserXML;
import org.xml.sax.SAXException;
import random.RandomSystem;

import java.io.IOException;

public class BreakSystem extends AutoSystem {

    private static final String URL = "file:E:\\Programming\\Курсач\\autoinspectionstation\\src\\main\\java\\resources\\BreakSystem.xml";

    @Override
    public boolean toDoTest() throws IOException, SAXException {
        malfunction = ParserXML.pars(URL);
        int rand = RandomSystem.generateError();
        if (rand > 0) {
            for (int i = 0; i < rand; i++) {
                int index = RandomSystem.generateIndex(malfunction.size());
                generatedErrors.add(malfunction.get(index));
                System.out.println(malfunction.get(index));
            }
            return true;
        }
        return false;
    }
}
