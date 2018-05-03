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

    abstract void toDoTest() throws IOException, SAXException;
}
