package com.example.Maat.parser;

import com.example.Maat.entity.Security;
import org.springframework.stereotype.Component;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class SecurityParser {
    public void parseSecurity() throws ParserConfigurationException, SAXException, IOException
    {
        List<Security> employees = parseSecuritiesXML();
        System.out.println(employees);
    }

    private static List<Security> parseSecuritiesXML() throws ParserConfigurationException, SAXException, IOException
    {
        //Initialize a list of rows
        List<Security> employees = new ArrayList<>();
        Security security;

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("securities_1.xml"));
        document.getDocumentElement().normalize();
        NodeList securityList = document.getElementsByTagName("row");
        for (int i = 0; i < securityList.getLength(); i++)
        {
            Node node = securityList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE)
            {
                Element element = (Element) node;

                //Create new Security Object
                security = new Security();
                security.setId(Integer.parseInt(element.getAttribute("id")));
                security.setSecId(element.getAttribute("secid"));
                security.setShortName(element.getAttribute("shortname"));
                security.setRegNumber(element.getAttribute("regnumber"));
                security.setName(element.getAttribute("secname"));
                security.setIsIn(element.getAttribute("isin"));
                security.setIsTraded(Integer.parseInt(element.getAttribute("is_traded")));
                security.setEmitentId(Integer.parseInt(element.getAttribute("emitent_id")));
                security.setEmitentTitle(element.getAttribute("emitent_title"));
                security.setEmitentInn(Long.parseLong(element.getAttribute("emitent_inn")));
                security.setEmitentOkpo(Integer.parseInt(element.getAttribute("emitent_okpo")));
                security.setGosReg(element.getAttribute("gosreg"));
                security.setSecType(element.getAttribute("sectype"));
                security.setGosReg(element.getAttribute("secgroup"));
                security.setPrimaryBoardId(element.getAttribute("primary_boardid"));
                security.setMarketPriceBoardId(element.getAttribute("marketprice_boardid"));

                //Add Employee to list
                employees.add(security);
            }
        }
        return employees;
    }
}
