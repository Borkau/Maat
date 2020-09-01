package com.example.Maat.dto;

import lombok.Data;
import lombok.Builder;

@Data
@Builder

public class HistoryDto {

    private Integer id;
    private String boardId;
    private String tradeDate;
    private String shortHistoryName;
    private String secHisID;
    private String numTrades;
    private String valueHis;
    private String lowHis;
    private String highHis;
    private String legalClosePrice;
    private String waPrice;
    private String closeHis;
    private String volumeHis;
    private String marketPrice2;
    private String marketPrice3;
    private String admittedQuote;
    private String mp2ValTrd;
    private String marketPrice3TradesValue;
    private String admittedValue;
    private String waVal;
}

// Data Transfer Object