package com.nefedov.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

@Entity
@Table(name = "buy")
public class Buy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_number")
    private int id;

    @Column(name = "date_buy")
    private String dateBuy;

    @Column(name = "seller")
    private int seller;

    @Column(name = "buyer")
    private int buyer;

    @Column(name = "book")
    private int book;

    @Column(name = "amount")
    private int amount;

    @Column(name = "summ")
    private int summ;

    public Buy() {
    }

    public Buy(String dateBuy, int seller, int buyer, int book, int amount, int summ) {
        this.dateBuy = dateBuy;
        this.seller = seller;
        this.buyer = buyer;
        this.book = book;
        this.amount = amount;
        this.summ = summ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDateBuy() {
        return dateBuy;
    }

    public void setDateBuy(String dateBuy) {
        this.dateBuy = dateBuy;
    }

    public int getSeller() {
        return seller;
    }

    public void setSeller(int seller) {
        this.seller = seller;
    }

    public int getBuyer() {
        return buyer;
    }

    public void setBuyer(int buyer) {
        this.buyer = buyer;
    }

    public int getBook() {
        return book;
    }

    public void setBook(int book) {
        this.book = book;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getSumm() {
        return summ;
    }

    public void setSumm(int summ) {
        this.summ = summ;
    }

    @Override
    public String toString() {
        return "Buy{" +
                "id=" + id +
                ", dateBuy='" + dateBuy + '\'' +
                ", seller=" + seller +
                ", buyer=" + buyer +
                ", book=" + book +
                ", amount=" + amount +
                ", summ=" + summ +
                '}';
    }
}
