package com.courseproject.entity;

import com.courseproject.parser.ParserXML;
import org.xml.sax.SAXException;

import java.io.IOException;

public class Engine extends AutoSystem{
    private static final String URL = "src\\main\\java\\com\\courseproject\\resources\\Engine.resources";

    @Override
    boolean toDoTest() throws IOException, SAXException {
        malfunction = ParserXML.pars(URL);
        return false;
    }
}
