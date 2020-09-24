package com.example.Maat.service;

import com.example.Maat.dto.SecurityDto;
import org.springframework.stereotype.Component;

@Component
public class SecurityConverter {

        public com.example.Maat.entity.Security fromSecurityDtoToSecurity(SecurityDto securityDto) {
                com.example.Maat.entity.Security security = new com.example.Maat.entity.Security();
                security.setId(securityDto.getId());
                security.setSecId(securityDto.getSecId());
                security.setShortName(securityDto.getShortName());
                security.setRegNumber(securityDto.getRegNumber());
                security.setName(securityDto.getName());
                security.setIsIn(securityDto.getIsIn());
                security.setIsTraded(securityDto.getIsTraded());
                security.setEmitentId(securityDto.getEmitentId());
                security.setEmitentTitle(securityDto.getEmitentTitle());
                security.setEmitentInn(securityDto.getEmitentInn());
                security.setEmitentOkpo(securityDto.getEmitentOkpo());
                security.setGosReg(securityDto.getGosReg());
                security.setSecType(securityDto.getSecType());
                security.setSecGroup(securityDto.getSecGroup());
                security.setPrimaryBoardId(securityDto.getPrimaryBoardId());
                security.setMarketPriceBoardId(securityDto.getMarketPriceBoardId());

                return security;
        }

        public SecurityDto fromSecurityToSecurityDto(com.example.Maat.entity.Security security) {
                return SecurityDto.builder()
                        .id(security.getId())
                        .secId(security.getSecId())
                        .shortName(security.getShortName())
                        .regNumber(security.getRegNumber())
                        .name(security.getName())
                        .isIn(security.getIsIn())
                        .isTraded(security.getIsTraded())
                        .emitentId(security.getEmitentId())
                        .emitentTitle(security.getEmitentTitle())
                        .emitentInn(security.getEmitentInn())
                        .emitentOkpo(security.getEmitentOkpo())
                        .gosReg(security.getGosReg())
                        .secType(security.getSecType())
                        .secGroup(security.getSecGroup())
                        .primaryBoardId(security.getPrimaryBoardId())
                        .marketPriceBoardId(security.getMarketPriceBoardId())
                        .build();
        }
}
