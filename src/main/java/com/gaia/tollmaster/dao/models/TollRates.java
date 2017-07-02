package com.gaia.tollmaster.dao.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by Parth on 01/07/2017.
 */
@Entity
public class TollRates {

    @Id
    private int RateId;

    @ManyToOne
    private TollPlaza tollId;

    private Character vehicleType;

    private int tollRate;

    public TollRates(int rateId, TollPlaza tollId, Character vehicleType, int tollRate) {
        RateId = rateId;
        this.tollId = tollId;
        this.vehicleType = vehicleType;
        this.tollRate = tollRate;
    }

    public TollRates() {
    }

    public int getRateId() {
        return RateId;
    }

    public void setRateId(int rateId) {
        RateId = rateId;
    }

    public TollPlaza getTollId() {
        return tollId;
    }

    public void setTollId(TollPlaza tollId) {
        this.tollId = tollId;
    }

    public Character getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(Character vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getTollRate() {
        return tollRate;
    }

    public void setTollRate(int tollRate) {
        this.tollRate = tollRate;
    }
}
