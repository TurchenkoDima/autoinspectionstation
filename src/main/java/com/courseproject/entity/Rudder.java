package com.courseproject.entity;

import com.courseproject.parser.ParserXML;
import org.xml.sax.SAXException;

import java.io.IOException;

public class Rudder extends AutoSystem {
    private static final String URL = "src\\main\\java\\com\\courseproject\\resources\\Rudder.resources";
    @Override
    boolean toDoTest() throws IOException, SAXException {
        malfunction = ParserXML.pars(URL);
        return false;
    }
}