package com.example.Maat.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table (name = "histories")
@Data // lombok annotation
@NoArgsConstructor



public class History {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer hisId;

    @NotNull
    @Column(name = "BOARDID")
    private String boardId;

    @NotNull
    @Column(name = "TRADEDATE")
    private String tradeDate;

    @NotNull
    @Column(name = "SHORTNAME")
    private String shortHistoryName;

    @NotNull
    @Column(name = "SECID")
    private String secHisId;

    @NotNull
    @Column(name = "NUMTRADES")
    private Double numTrades;

    @Column(name = "HISVALUE")
    private Double valueHis;

    @Column(name = "HISOPEN")
    private Double hisOpen;

    @Column(name = "LOW")
    private Double lowHis;

    @Column(name = "HIGH")
    private Double highHis;

    @Column(name = "LEGALCLOSEPRICE")
    private Double legalClosePrice;

    @Column(name = "WAPRICE")
    private Double waPrice;

    @Column(name = "HISCLOSE")
    private Double closeHis;

    @Column(name = "VOLUME")
    private Double volumeHis;

    @Column(name = "MARKETPRICE2")
    private Double marketPrice2;

    @Column(name = "MARKETPRICE3")
    private Double marketPrice3;

    @Column(name = "ADMITTEDQUOTE")
    private Double admittedQuote;

    @Column(name = "MARKETPRICE3TRADESVALUE")
    private Double marketPrice3TradesValue;

    @Column(name = "ADMITTEDVALUE")
    private Double admittedValue;
}
