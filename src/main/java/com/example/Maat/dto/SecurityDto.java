package com.example.Maat.dto;


import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class SecurityDto {

    public Integer id;
    public String secId;
    public String shortName;
    public String regNumber;


    public String name;

    public String isIn;
    public Integer isTraded;
    public Integer emitentId;
    public String emitentTitle;
    public Long emitentInn;
    public Integer emitentOkpo;
    public String gosReg;
    public String secType;
    public String secGroup;
    public String primaryBoardId;
    public String marketPriceBoardId;

}
//Data Transfer Object     @Pattern(regexp = "^[а-яА-ЯёЁ0-9\\s]+$", message = "Cyrillic, numbers and spaces only")