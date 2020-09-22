package com.example.Maat.parser;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class ParserDom {
    public static void main(String[] arg) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();

        Document document = documentBuilder.parse("G:/32.xml");
        String file = document.getDocumentElement().getNodeName();

        System.out.println("Первый элемент " + file);

        String FIO; //Переменная

        NodeList nodeList = document.getElementsByTagName("ПерсИнфо");
        for (int i= 0; i < nodeList.getLength(); i++){
            Element element = (Element) nodeList.item(i);
            Node item = element.getElementsByTagName("ФИОД").item(0);
            NamedNodeMap attributes = item.getAttributes();
            System.out.println(attributes.getNamedItem("Фамилия"));
            System.out.println(attributes.getNamedItem("Имя"));
            System.out.println(attributes.getNamedItem("Отчество"));
            System.out.println(attributes.getNamedItem("ДатаРожд"));
        }
    }
}
