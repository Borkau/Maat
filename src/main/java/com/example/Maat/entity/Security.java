package com.example.Maat.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table (name = "securities")
@Data // lombok annotation for get|set, toString etc
@NoArgsConstructor

public class Security {

    @Id
    private Integer id;

    @Column (name = "secid")
    private String secId;

    @Column (name = "shortname")
    private String shortName;

    @Column (name = "regnumber")
    private String regNumber;

    @Column (name = "name")
    private String name;

    @Column (name = "isin")
    private String isIn;

    @Column (name = "is_traded")
    private String isTraded;

    @Column (name = "emitent_id")
    private String emitentId;

    @Column (name = "emitent_title")
    private String emitentTitle;

    @Column (name = "emitent_inn")
    private String emitentInn;

    @Column (name = "emitent_okpo")
    private String emitentOkpo;

    @Column (name = "gosreg")
    private String gosReg;

    @Column (name = "type")
    private String secType;

    @Column (name = "group")
    private String secGroup;

    @Column (name = "primary_boardId")
    private String primaryBoardId;

    @Column (name = "marketprice_boardId")
    private String marketPriceBoardId;

}
