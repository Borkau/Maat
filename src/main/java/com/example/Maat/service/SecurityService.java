package com.example.Maat.service;

import com.example.Maat.dto.SecurityDto;

import java.util.List;

public interface SecurityService {
    SecurityDto saveSecurity(SecurityDto securityDto);
    void deleteSecurity(Integer securityId);
    SecurityDto findByName(String name);
    List<SecurityDto> findAll();
}
