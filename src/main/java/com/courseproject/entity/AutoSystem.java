package com.courseproject.entity;

import com.courseproject.parser.ParserXML;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public abstract class AutoSystem {
    /**/
    ArrayList<String> malfunction = new ArrayList<>();
    ArrayList<String> generatedErrors = new ArrayList<>();

    abstract boolean toDoTest() throws IOException, SAXException;

    public ArrayList<String> getGeneratedErrors() { return generatedErrors; }
    public ArrayList<String> getMalfunction() {
        return malfunction;
    }
}
