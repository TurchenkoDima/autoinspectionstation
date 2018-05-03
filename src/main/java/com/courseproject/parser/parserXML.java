package com.courseproject.parser;

import com.sun.org.apache.xerces.internal.parsers.DOMParser;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.Objects;

public class parserXML {
    public static void main(String[] args) throws Exception {
            ArrayList<String> persons = new ArrayList<>();
            DOMParser parser = new DOMParser();
            parser.parse("D:\\git\\autoinspectionstation\\src\\main\\java\\com\\courseproject\\resources\\BreakSystem.xml");
            Document document = parser.getDocument();

            Element root = document.getDocumentElement();
            NodeList personNodes = root.getElementsByTagName("malfunction");

            for (int i = 0; i<personNodes.getLength();i++)
                System.out.println(personNodes.item(i).getTextContent());
            /*boolean flag = true;
            for (int i = 0; i < personNodes.getLength(); i++) {
                if (i != 0) {
                    for (int k = 0; k < persons.size(); k++) {
                        if (Objects.equals(persons.get(k), personNodes.item(i).getAttributes().item(0).getTextContent())) {
                            flag = false;
                        }
                    }
                    if (flag) {
                        persons.add(personNodes.item(i).getAttributes().item(0).getTextContent());
                    }
                } else persons.add(personNodes.item(i).getAttributes().item(0).getTextContent());
            }

            int max = persons.get(0).length();
            int min = persons.get(0).length();
            for (int i = 1; i < persons.size(); i++) {
                if (max < persons.get(i).length())
                    max = persons.get(i).length();
                if (min > persons.get(i).length())
                    min = persons.get(i).length();
            }
            for (String s : persons) {
                if (s.length() == max)
                    System.out.println("Максимум: "+s);
                if (s.length() == min)
                    System.out.println("Минимум: "+s);
            }*/
       }
}
