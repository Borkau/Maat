package com.example.Maat.dto;


import lombok.Data;
import lombok.Builder;
import javax.validation.constraints.Pattern;

@Data
@Builder

public class SecurityDto {

    private Integer id;
    private String secId;
    private String shortName;
    private String regNumber;


    @Pattern(regexp = "^[а-яА-ЯёЁ0-9\\s]+$", message = "Cyrillic, numbers and spaces only")
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