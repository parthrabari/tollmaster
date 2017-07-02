package com.gaia.tollmaster.dao.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Parth on 01/07/2017.
 */

@Entity
public class Company {
    @Id
    private String name;

    private int Phone;

    private String email;

    private String Address;

    @OneToMany
    private Collection<TollPlaza> tollPlazas;

    public Company(String name, int phone, String email, String address, Collection<TollPlaza> tollPlazas) {
        this.name = name;
        Phone = phone;
        this.email = email;
        Address = address;
        this.tollPlazas = tollPlazas;
    }

    public Company() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Collection<TollPlaza> getTollPlazas() {
        return tollPlazas;
    }

    public void setTollPlazas(Collection<TollPlaza> tollPlazas) {
        this.tollPlazas = tollPlazas;
    }
}
