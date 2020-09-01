package com.example.Maat.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data // lombok annotation for get|set, toString etc
@NoArgsConstructor

public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String secId;

    @Column
    private String shortName;

    @Column
    private String regNumber;

    @Column
    private String secName;

    @Column
    private String isIn;

    @Column
    private String isTraded;

    @Column
    private String emitentId;

    @Column
    private String emitentTitle;

    @Column
    private String emitentInn;

    @Column
    private String emitentOkpo;

    @Column
    private String gosReg;

    @Column
    private String secType;

    @Column
    private String secGroup;

    @Column
    private String primaryBoardId;

    @Column
    private String marketPriceBoardId;
}
