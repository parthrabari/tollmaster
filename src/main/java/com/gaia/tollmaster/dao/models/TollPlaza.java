package com.gaia.tollmaster.dao.models;

import javax.persistence.*;

/**
 * Created by Parth on 01/07/2017.
 */
@Entity
public class TollPlaza {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int tollId;

    private String name;

    @OneToOne
    private TollAdmin adminName;

    private Character Type;

    @Column(precision = 10)
    private double entryExit0;

    @Column(precision = 10)
    private double entryExit1;

    public int getTollId() {
        return tollId;
    }

    public void setTollId(int tollId) {
        this.tollId = tollId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TollAdmin getAdminName() {
        return adminName;
    }

    public void setAdminName(TollAdmin adminName) {
        this.adminName = adminName;
    }
}
