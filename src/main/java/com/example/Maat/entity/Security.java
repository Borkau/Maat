package com.example.Maat.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;

@Entity
@Table (name = "securities")
@Data
@NoArgsConstructor

public class Security {

    @Id
    @NotNull
    private Integer id;

    @Column (name = "secid")
    @NotNull
    private String secId;

    @Column (name = "shortname")
    @NotNull
    private String shortName;

    @Column (name = "regnumber")
    private String regNumber;

    @Column (name = "secname")
    @NotNull
    private String name;

    @Column (name = "isin")
    private String isIn;

    @Column (name = "is_traded")
    private Integer isTraded;

    @Column (name = "emitent_id")
    private Integer emitentId;

    @Column (name = "emitent_title")
    private String emitentTitle;

    @Column (name = "emitent_inn")
    private Long emitentInn;

    @Column (name = "emitent_okpo")
    private Integer emitentOkpo;

    @Column (name = "gosreg")
    private String gosReg;

    @Column (name = "sectype")
    private String secType;

    @Column (name = "secgroup")
    private String secGroup;

    @Column (name = "primary_boardid")
    private String primaryBoardId;

    @Column (name = "marketprice_boardid")
    private String marketPriceBoardId;
}
