package com.example.Maat.serviceImpl;


import com.example.Maat.dto.SecurityDto;
import com.example.Maat.entity.Security;
import com.example.Maat.parser.SecurityParser;
import com.example.Maat.repository.SecurityRepository;
import com.example.Maat.service.SecurityConverter;
import com.example.Maat.service.SecurityService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
public class SecurityServiceImpl implements SecurityService {

    private final SecurityRepository securityRepository;
    private final SecurityConverter securityConverter;
    private final SecurityParser securityParser;

    @Transactional
    @Override
    public SecurityDto saveSecurity(SecurityDto securityDto) {
        com.example.Maat.entity.Security savedSecurity = securityRepository.save(securityConverter.fromSecurityDtoToSecurity(securityDto));
        return securityConverter.fromSecurityToSecurityDto(savedSecurity);
    }

    @Transactional
    @Override
    public void deleteSecurity(Integer securityId) {
        securityRepository.deleteById(securityId);
    }

    @Transactional
    @Override
    public List<SecurityDto> findByName(String name) {
        return securityRepository.findByName(name)
                .stream()
                .map(securityConverter::fromSecurityToSecurityDto)
                .collect(Collectors.toList());
        }

    @Transactional
    @Override
    public List<SecurityDto> findAll() {
        return securityRepository.findAll()
                .stream()
                .map(securityConverter::fromSecurityToSecurityDto)
                .collect(Collectors.toList());
    }

    @Transactional
    @Override
    public List<Security> saveAll() throws IOException, SAXException, ParserConfigurationException {
        return securityRepository.saveAll(securityParser.parseSecurity());
    }
}

