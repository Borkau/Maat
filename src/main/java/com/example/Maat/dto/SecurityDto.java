package com.example.Maat.dto;


import lombok.Data;
import lombok.Builder;

@Data
@Builder

public class SecurityDto {

    private Integer id;
    private String secId;
    private String shortName;
    private String regNumber;
    private String secName;
    private String isIn;
    private String isTraded;
    private String emitentId;
    private String emitentTitle;
    private String emitentInn;
    private String emitentOkpo;
    private String gosReg;
    private String secType;
    private String secGroup;
    private String primaryBoardId;
    private String marketPriceBoardId;
}
//Data Transfer Object