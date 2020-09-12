package com.example.Maat.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table (name = "histories")
@Builder
@Data // lombok annotation
@NoArgsConstructor
@AllArgsConstructor


public class History {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Integer hisId;

    @NotNull
    @Column (name = "boardid")
    private String boardId;

    @NotNull
    @Column (name = "tradedate")
    private String tradeDate;

    @NotNull
    @Column (name = "shortname")
    private String shortHistoryName;

    @NotNull
    @Column (name = "secid")
    private String secHisId;

    @NotNull
    @Column (name = "numtrades")
    private String numTrades;

    @Column (name = "hisvalue")
    private Double valueHis;

    @Column (name = "hisopen")
    private Double hisOpen;

    @Column (name = "low")
    private Double lowHis;

    @Column (name = "high")
    private Double highHis;

    @Column (name = "legalcloseprice")
    private Double legalClosePrice;

    @Column (name = "waprice")
    private Double waPrice;

    @Column (name = "hisclose")
    private Double closeHis;

    @Column (name = "volume")
    private Double volumeHis;

    @Column (name = "marketprice2")
    private Double marketPrice2;

    @Column (name = "marketprice3")
    private Double marketPrice3;

    @Column (name = "admittedquote")
    private Double admittedQuote;

    @Column (name = "marketprice3tradesvalue")
    private Double marketPrice3TradesValue;

    @Column (name = "admittedvalue")
    private Double admittedValue;


}
