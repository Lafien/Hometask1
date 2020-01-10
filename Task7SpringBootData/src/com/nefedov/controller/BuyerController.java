package com.nefedov.controller;

import com.nefedov.entity.Book;
import com.nefedov.entity.Buyer;
import com.nefedov.service.BookService;
import com.nefedov.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BuyerController {

    @Autowired
    BuyerService buyerService;

    @GetMapping("/buyer/findBySurname")
    public ResponseEntity<Buyer> findByName(@RequestParam String surname){
        List<Buyer> list = buyerService.retrieveBySurname(surname);

        if(list == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else {
            return ResponseEntity.ok(list.get(0));
        }
    }

    @DeleteMapping("/buyer/deleteById")
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public void deleteById(@RequestParam int id){
        buyerService.deleteById(id);
    }

    @GetMapping("/buyer/getAll")
    public List<Buyer> getAll(){
        List<Buyer> list = buyerService.getAll();
            return list;
    }

    @PatchMapping("/buyer/setSomething")
    public void setSomething(@RequestParam String surname, @RequestParam int id){
        buyerService.setSomething(surname, id);
    }

    @PostMapping("/buyer/add")
    @ResponseStatus(code = HttpStatus.OK)
    public void add(String surname, String residence, int discount){
        buyerService.add(surname, residence, discount);
    }

    @GetMapping("/buyer/findById")
    public List<Buyer> findById(int id){
        List<Buyer> list = buyerService.findById(id);
        return list;
    }

    @PutMapping("/buyer/fullRewriting")
    @ResponseStatus(code = HttpStatus.OK)
    public void fullRewriting(int id, String surname, String residence, int discount){
        buyerService.fullRewriting(id, surname, residence, discount);
    }

    @GetMapping("/buyer/getAnyResidence")
    public List<String> getAnyResidence(){
        List<String> list = buyerService.getAnyResidence();
        return list;
    }

    @GetMapping("/buyer/getSurnameDiscount")
    public List<Buyer> getAnyMonth(){
        List<Buyer> list = buyerService.getSurnameDiscount();
        return list;
    }

    @GetMapping("/buyer/getSurnameAndMagazine")
    public List<Object> getSurnameAndMagazine(){
        List<Object> list = buyerService.getSurnameAndMagazine();
        return list;
    }

    @GetMapping("/buyer/getBuyerAfterMarch")
    public List<Object> getBuyerAfterMarch(){
        List<Object> list = buyerService.getBuyerAfterMarch();
        return list;
    }




}
