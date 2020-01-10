package com.nefedov.service;

import com.nefedov.entity.Book;
import com.nefedov.entity.Buy;
import com.nefedov.repository.BooksRepository;
import com.nefedov.repository.BuyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class BuyService {

    @Autowired
    private BuyRepository buyRepository;

    public void deleteById(int id){
        buyRepository.deleteById(id);
    }

    public List<Buy> getAll(){
        return buyRepository.getAll();
    }

    public void setSomething(int summ, int id){
        buyRepository.setSomething(summ, id);
    }

    public void add(Date dateBuy, int seller, int buyer, int book, int amount, int summ){
        buyRepository.add(dateBuy, seller, buyer, book, amount, summ);
    }

    public List<Buy> findById(int id){
        return buyRepository.findById(id);
    }

    public void fullRewriting(int id, Date dateBuy, int seller, int buyer, int book, int amount, int summ){
        buyRepository.fullRewriting(id, dateBuy, seller, buyer, book, amount, summ);
    }

    public List<Double> getAnyMonth(){
        return buyRepository.getAnyMonth();
    }

    public List<Object> getDateSurnameDiscount(){
        return buyRepository.getDateSurnameDiscount();
    }

    public List<Object> getTicketSurnameDateBigBuy(){
        return buyRepository.getTicketSurnameDateBigBuy();
    }



}

