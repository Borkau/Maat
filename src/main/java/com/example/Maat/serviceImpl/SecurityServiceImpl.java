package com.example.Maat.serviceImpl;


import com.example.Maat.dto.SecurityDto;
import com.example.Maat.entity.Security;
import com.example.Maat.repository.SecurityRepository;
import com.example.Maat.service.SecurityConverter;
import com.example.Maat.service.SecurityService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
public class SecurityServiceImpl implements SecurityService {

    private final SecurityRepository securityRepository;
    private final SecurityConverter securityConverter;

    @Override
    public SecurityDto saveSecurity(SecurityDto securityDto) {
        Security savedSecurity = securityRepository.save(securityConverter.fromSecurityDtoToSecurity(securityDto));
        return securityConverter.fromSecurityTiSecurityDto(savedSecurity);
    }

    @Override
    public void deleteSecurity(Integer securityId) {
        securityRepository.deleteById(securityId);
    }

    @Override
    public SecurityDto findByName(String secName) {
        Security security = securityRepository.findByName(secName);
        if(security != null) {
            return securityConverter.fromSecurityTiSecurityDto(security);
        }
        return null;
    }

    @Override
    public List<SecurityDto> findAll() {
        return securityRepository.findAll()
                .stream()
                .map(securityConverter::fromSecurityTiSecurityDto)
                .collect(Collectors.toList());
    }
}

