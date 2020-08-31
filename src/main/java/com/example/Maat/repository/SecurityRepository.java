package com.example.Maat.repository;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data // lombok annotation for get|set, toString etc
@NoArgsConstructor

public class SecurityRepository {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String secid;

    @Column
    private String shortname;

    @Column
    private String regnumber;

    @Column
    private String name;

    @Column
    private String isin;

    @Column
    private String is_traded;

    @Column
    private String emitent_id;

    @Column
    private String emitent_title;

    @Column
    private String emitent_inn;

    @Column
    private String emitent_okpo;

    @Column
    private String gosreg;

    @Column
    private String type;

    @Column
    private String group;

    @Column
    private String primary_boardid;

    @Column
    private String marketprice_boardid;
}
