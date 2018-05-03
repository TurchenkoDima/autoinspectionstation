package com.courseproject.parser;

import com.sun.org.apache.xerces.internal.parsers.DOMParser;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class parserXML {
    public static void main(String[] args) throws Exception {
        DOMParser parser = new DOMParser();
        parser.parse("D:\\git\\autoinspectionstation\\src\\main\\java\\com\\courseproject\\resources\\BreakSystem.xml");
        Document document = parser.getDocument();

        Element root = document.getDocumentElement();
        NodeList sectionNodes = root.getElementsByTagName("title");
        NodeList personNodes = root.getElementsByTagName("malfunction");
        System.out.println(sectionNodes.item(0).getTextContent());

        for (int i = 0; i < personNodes.getLength(); i++) {
            System.out.println(personNodes.item(i).getTextContent());
        }
    }
}
