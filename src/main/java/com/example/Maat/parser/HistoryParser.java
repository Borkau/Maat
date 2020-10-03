package com.example.Maat.parser;

import com.example.Maat.entity.History;
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
public class HistoryParser {
    public List<History> parseHistory() throws ParserConfigurationException, SAXException, IOException {

        // copy files from maat-temp to project src directory
        for (int s = 1; s < 5; s++) {
            File source = new File("C:\\maat-temp\\history_" + s + ".xml");
            File dest = new File("history_" + s + ".xml");
            try {
                FileUtils.copyFile(source, dest);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
        List<History> histories = parseHistoriesXML();
        System.out.println(histories);
        return histories;
    }


    private static List<History> parseHistoriesXML() throws ParserConfigurationException, SAXException, IOException {
        //Initialize a list of rows
        List<History> histories = new ArrayList<>();
        History history;

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        for (int y = 1; y < 5; y++) {
            Document document = builder.parse(new File("history_" + y + ".xml"));
            document.getDocumentElement().normalize();
            NodeList historyList = document.getElementsByTagName("row");
            for (int i = 0; i < historyList.getLength(); i++) {
                Node node = historyList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    // create new Security Object
                    history = new History();
                    history.setHisId(i + y * 100);
                    history.setBoardId(element.getAttribute("BOARDID"));
                    history.setTradeDate(element.getAttribute("TRADEDATE"));
                    history.setShortHistoryName(element.getAttribute("SHORTNAME"));
                    history.setSecHisId(element.getAttribute("SECID"));
                    history.setNumTrades(strToDouble(element.getAttribute("NUMTRADES")));
                    history.setValueHis(strToDouble(element.getAttribute("VALUE")));
                    history.setHisOpen(strToDouble(element.getAttribute("OPEN")));
                    history.setLowHis(strToDouble(element.getAttribute("LOW")));
                    history.setHighHis(strToDouble(element.getAttribute("HIGH")));
                    history.setLegalClosePrice(strToDouble(element.getAttribute("LEGALCLOSEPRICE")));
                    history.setWaPrice(strToDouble(element.getAttribute("WAPRICE")));
                    history.setCloseHis(strToDouble(element.getAttribute("CLOSE")));
                    history.setVolumeHis(strToDouble(element.getAttribute("VOLUME")));
                    history.setMarketPrice2(strToDouble(element.getAttribute("MARKETPRICE2")));
                    history.setMarketPrice3(strToDouble(element.getAttribute("MARKETPRICE3")));
                    history.setAdmittedQuote(strToDouble(element.getAttribute("ADMITTEDQUOTE")));
                    history.setMarketPrice3TradesValue(strToDouble(element.getAttribute("MARKETPRICE3TRADESVALUE")));
                    history.setAdmittedValue(strToDouble(element.getAttribute("ADMITTEDVALUE")));

                    // add History to list
                    histories.add(history);
                }
            }
        }
        return histories;
    }

    private static double strToDouble(String s) {
        try {
            return Double.parseDouble(s);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
