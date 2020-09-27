package com.example.Maat.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class HistoryDto {

    private Integer hisId;
    private String boardId;
    private String tradeDate;
    private String shortHistoryName;
    private String secHisId;
    private Double numTrades;
    private Double valueHis;
    private Double hisOpen;
    private Double lowHis;
    private Double highHis;
    private Double legalClosePrice;
    private Double waPrice;
    private Double closeHis;
    private Double volumeHis;
    private Double marketPrice2;
    private Double marketPrice3;
    private Double admittedQuote;
    private Double marketPrice3TradesValue;
    private Double admittedValue;
}

// Data Transfer Object