package com.example.Maat.service;

import com.example.Maat.dto.SecurityDto;

import java.util.List;

public interface SecurityService {
    SecurityDto saveSecuruty(SecurityDto securityDto);
    void deleteSecurity(Integer securityId);
    SecurityDto findByName(String secName);
    List<SecurityDto> findAll();
}
