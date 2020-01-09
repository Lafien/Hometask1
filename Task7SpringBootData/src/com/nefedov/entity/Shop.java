package com.nefedov.entity;

import javax.persistence.*;

@Entity
@Table(name = "shop")
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_shop")
    private int idShop;

    @Column(name = "name_shop")
    private String nameShop;

    @Column(name = "locations")
    private String locations;

    @Column(name = "commission")
    private int commission;


    public Shop() {
    }

    public Shop(String nameShop, String locations, int commission) {
        this.nameShop = nameShop;
        this.locations = locations;
        this.commission = commission;
    }

    public int getIdShop() {
        return idShop;
    }

    public void setIdShop(int idShop) {
        this.idShop = idShop;
    }

    public String getNameShop() {
        return nameShop;
    }

    public void setNameShop(String nameShop) {
        this.nameShop = nameShop;
    }

    public String getLocations() {
        return locations;
    }

    public void setLocations(String locations) {
        this.locations = locations;
    }

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "idShop=" + idShop +
                ", nameShop='" + nameShop + '\'' +
                ", locations='" + locations + '\'' +
                ", commission=" + commission +
                '}';
    }
}
