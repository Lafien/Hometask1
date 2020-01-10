package com.nefedov.service;

import com.nefedov.entity.Book;
import com.nefedov.entity.Buyer;
import com.nefedov.repository.BooksRepository;
import com.nefedov.repository.BuyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyerService {

    @Autowired
    private BuyerRepository buyerRepository;

    public List<Buyer> retrieveBySurname(String surname){
        return buyerRepository.retrieveBySurname(surname);
    }

    public void deleteById(int id){
        buyerRepository.deleteById(id);
    }

    public List<Buyer> getAll(){
        return buyerRepository.getAll();
    }

    public void setSomething(String surname, int id){
        buyerRepository.setSomething(surname, id);
    }

    public void add(String surname, String residence, int discount){
        buyerRepository.add(surname, residence, discount);
    }

    public List<Buyer> findById(int id){
        return buyerRepository.findById(id);
    }

    public void fullRewriting(int id, String surname, String residence, int discount){
        buyerRepository.fullRewriting(id, surname, residence, discount);
    }

    public List<String> getAnyResidence(){
        return buyerRepository.getAnyResidence();
    }

    public List<Buyer> getSurnameDiscount(){
        return buyerRepository.getSurnameDiscount();
    }

    public List<Object> getSurnameAndMagazine(){
        return buyerRepository.getSurnameAndMagazine();
    }

    public List<Object> getBuyerAfterMarch(){
        return buyerRepository.getBuyerAfterMarch();
    }

}

