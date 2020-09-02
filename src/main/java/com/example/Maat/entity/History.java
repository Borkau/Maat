package com.example.Maat.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table (name = "history")
@Data // lombok annotation
@NoArgsConstructor

public class History {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer hisId;

    @Column
    private String boardId;

    @Column
    private String tradeDate;

    @Column
    private String shortHistoryName;

    @Column
    private String secHisID;

    @Column
    private String numTrades;

    @Column
    private String valueHis;

    @Column
    private String lowHis;

    @Column
    private String highHis;

    @Column
    private String legalClosePrice;

    @Column
    private String waPrice;

    @Column
    private String closeHis;

    @Column
    private String volumeHis;

    @Column
    private String marketPrice2;

    @Column
    private String marketPrice3;

    @Column
    private String admittedQuote;

    @Column
    private String mp2ValTrd;

    @Column
    private String marketPrice3TradesValue;

    @Column
    private String admittedValue;

    @Column
    private String waVal;

}
