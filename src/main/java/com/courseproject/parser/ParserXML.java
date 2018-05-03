package com.courseproject.parser;

import com.sun.org.apache.xerces.internal.parsers.DOMParser;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ParserXML {

    public static ArrayList<String> pars(String url) throws IOException, SAXException {
        DOMParser parser = new DOMParser();
        parser.parse(url);
        Document document = parser.getDocument();

        Element root = document.getDocumentElement();
        NodeList sectionNodes = root.getElementsByTagName("title");
        NodeList itemNodes = root.getElementsByTagName("malfunction");

        ArrayList<String> list = new ArrayList<>();
        list.add(sectionNodes.item(0).getTextContent());
        for (int i = 0; i< itemNodes.getLength();i++){
            list.add(itemNodes.item(i).getTextContent());
        }
        return list;
    }
}
