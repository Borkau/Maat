package com.example.Maat.parser;

import com.example.Maat.dto.SecurityDto;
import com.example.Maat.entity.Security;
import org.springframework.stereotype.Component;
import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Component
public class SecurityParser {
    public void parseSecurity() {
        String filepath = "securities_1.xml";
        File xmlFile = new File(filepath);
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        try {
            builder = factory.newDocumentBuilder();
            Document document = builder.parse(xmlFile);
            document.getDocumentElement().normalize();
            NodeList nodeList = document.getDocumentElement().getElementsByTagName("row");

            List<SecurityDto> securityList = new ArrayList<>();
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node security = nodeList.item(i);
                NamedNodeMap attributes = security.getAttributes();
                securityList.add(getSecurity(attributes.item(i)));
            }

            // печатаем в консоль информацию по каждому объекту Language
            for (SecurityDto sec : securityList) {
                System.out.println(sec.toString());
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    // создаем из узла документа объект Security
    private static SecurityDto getSecurity(Node node) {
        SecurityDto sec = new SecurityDto();
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) node;
            sec.setId(Integer.parseInt(getTagValue("id", element)));
            sec.setSecId(getTagValue("secid", element));
            sec.setShortName(getTagValue("shortname", element));
            sec.setRegNumber(getTagValue("regnumber", element));
            sec.setName(getTagValue("secname", element));
            sec.setIsIn(getTagValue("isin", element));
            sec.setIsTraded(Integer.parseInt(getTagValue("is_traded", element)));
            sec.setEmitentId(Integer.parseInt(getTagValue("emitent_id", element)));
            sec.setEmitentTitle(getTagValue("emitent_title", element));
            sec.setEmitentInn(Long.parseLong(getTagValue("emitent_inn", element)));
            sec.setEmitentOkpo(Integer.parseInt(getTagValue("emitent_okpo", element)));
            sec.setGosReg(getTagValue("gosreg", element));
            sec.setSecType(getTagValue("sectype", element));
            sec.setGosReg(getTagValue("gosreg", element));
            sec.setPrimaryBoardId(getTagValue("primary_boardid", element));
            sec.setMarketPriceBoardId(getTagValue("marketprice_boardid", element));
        }
        return sec;
    }

    // получаем значение элемента по указанному тегу
    private static String getTagValue(String tag, Element element) {
        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
        Node node = nodeList.item(0);
        return node.getNodeValue();
    }
}
