package com.example.Maat.service;

import com.example.Maat.dto.HistoryDto;
import com.example.Maat.entity.History;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;

public interface HistoryService {
    HistoryDto saveHistory(HistoryDto historyDto);
    void deleteHistory(Integer hisId);
    void deleteAllHis();
    List<HistoryDto> findBySecHisId(String secHisId);
    List<HistoryDto> findAllHis();
    List<History> saveAll() throws IOException, SAXException, ParserConfigurationException;

}
