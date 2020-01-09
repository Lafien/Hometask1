package com.nefedov.entity;

import javax.persistence.*;

@Entity
@Table(name = "buyer")
public class Buyer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "surname")
    private String surname;

    @Column(name = "residence")
    private String residence;

    @Column(name = "discount")
    private int discount;


    public Buyer() {
    }

    public Buyer(String surname, String residence, int discount) {
        this.surname = surname;
        this.residence = residence;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", residence=" + residence +
                ", discount='" + discount + '\'' +
                '}';
    }
}
