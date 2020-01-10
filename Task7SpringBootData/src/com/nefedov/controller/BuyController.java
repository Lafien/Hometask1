package com.nefedov.controller;

import com.nefedov.entity.Buy;
import com.nefedov.entity.Buyer;
import com.nefedov.service.BuyService;
import com.nefedov.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
public class BuyController {

    @Autowired
    BuyService buyService;


    @DeleteMapping("/buy/deleteById")
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public void deleteById(@RequestParam int id){
        buyService.deleteById(id);
    }

    @GetMapping("/buy/getAll")
    public List<Buy> getAll(){
        List<Buy> list = buyService.getAll();
            return list;
    }

    @PatchMapping("/buy/setSomething")
    public void setSomething(@RequestParam int summ, @RequestParam int id){
        buyService.setSomething(summ, id);
    }

    @PostMapping("/buy/add")
    @ResponseStatus(code = HttpStatus.OK)
    public void add(Date dateBuy, int seller, int buyer, int book, int amount, int summ){
        buyService.add(dateBuy, seller, buyer, book, amount, summ);
    }

    @GetMapping("/buy/findById")
    public List<Buy> findById(int id){
        List<Buy> list = buyService.findById(id);
        return list;
    }

    @PutMapping("/buy/fullRewriting")
    @ResponseStatus(code = HttpStatus.OK)
    public void fullRewriting(int id, Date dateBuy, int seller, int buyer, int book, int amount, int summ){
        buyService.fullRewriting(id, dateBuy, seller, buyer, book, amount, summ);
    }


    @GetMapping("/buy/getAnyMonth")
    public List<Double> getAnyMonth(){
        List<Double> list = buyService.getAnyMonth();
        return list;
    }

    @GetMapping("/buy/getDateSurnameDiscount")
    public List<Object> getDateSurnameDiscount(){
        List<Object> list = buyService.getDateSurnameDiscount();
        return list;
    }

    @GetMapping("/buy/getTicketSurnameDateBigBuy")
    public List<Object> getTicketSurnameDateBigBuy(){
        List<Object> list = buyService.getTicketSurnameDateBigBuy();
        return list;
    }



}
