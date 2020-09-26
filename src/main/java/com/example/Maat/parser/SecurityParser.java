package com.example.Maat.parser;

import com.example.Maat.entity.Security;
import org.apache.commons.io.FileUtils;
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
    public List<Security> parseSecurity() throws ParserConfigurationException, SAXException, IOException {

        // copy files from maat-temp to project src directory
        for (int s = 1; s < 3; s++) {
            File source = new File("C:\\maat-temp\\securities_" + s + ".xml");
            File dest = new File("securities_" + s + ".xml");
            try {
                FileUtils.copyFile(source, dest);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
        List<Security> securities = parseSecuritiesXML();
        System.out.println(securities);
        return securities;
    }


    private static List<Security> parseSecuritiesXML() throws ParserConfigurationException, SAXException, IOException {
        //Initialize a list of rows
        List<Security> securities = new ArrayList<>();
        Security security;

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        for (int y = 1; y < 3; y++) {
            Document document = builder.parse(new File("securities_" + y + ".xml"));
            document.getDocumentElement().normalize();
            NodeList securityList = document.getElementsByTagName("row");
            for (int i = 0; i < securityList.getLength(); i++) {
                Node node = securityList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    // create new Security Object
                    security = new Security();
                    security.setId(strToInt(element.getAttribute("id")));
                    security.setSecId(element.getAttribute("secid"));
                    security.setShortName(element.getAttribute("shortname"));
                    security.setRegNumber(element.getAttribute("regnumber"));
                    security.setName(element.getAttribute("secname"));
                    security.setIsIn(element.getAttribute("isin"));
                    security.setIsTraded(strToInt(element.getAttribute("is_traded")));
                    security.setEmitentId(strToInt(element.getAttribute("emitent_id")));
                    security.setEmitentTitle(element.getAttribute("emitent_title"));
                    security.setEmitentInn(strToLong(element.getAttribute("emitent_inn")));
                    security.setEmitentOkpo(strToInt(element.getAttribute("emitent_okpo")));
                    security.setGosReg(element.getAttribute("gosreg"));
                    security.setSecType(element.getAttribute("sectype"));
                    security.setGosReg(element.getAttribute("secgroup"));
                    security.setPrimaryBoardId(element.getAttribute("primary_boardid"));
                    security.setMarketPriceBoardId(element.getAttribute("marketprice_boardid"));

                    // add Security to list
                    securities.add(security);
                }
            }
        }
        return securities;
    }

    // handling methods parseInt and parseLong because string can be null
    private static int strToInt(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    private static long strToLong(String s) {
        try {
            return Long.parseLong(s);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
