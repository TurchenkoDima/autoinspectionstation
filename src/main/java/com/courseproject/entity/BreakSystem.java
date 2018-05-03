package com.courseproject.entity;

import com.courseproject.parser.ParserXML;
import org.xml.sax.SAXException;

import java.io.IOException;

public class BreakSystem extends AutoSystem {

    private static final String URL = "src\\main\\java\\com\\courseproject\\resources\\BreakSystem.xml";

    @Override
    public void toDoTest() throws IOException, SAXException {
        malfunction = ParserXML.pars(URL);
        System.out.println(malfunction.get(11));
        //int rand =
    }
}
