package com.gaia.tollmaster.dao.Models;

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
