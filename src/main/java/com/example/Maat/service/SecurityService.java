package com.example.Maat.service;

import com.example.Maat.dto.SecurityDto;
import com.example.Maat.entity.Security;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;

public interface SecurityService {
    SecurityDto saveSecurity(SecurityDto securityDto);
    void deleteSecurity(Integer securityId);
    List<SecurityDto> findByName(String name);
    List<SecurityDto> findAll();
    List<Security> saveAll() throws IOException, SAXException, ParserConfigurationException;
}
