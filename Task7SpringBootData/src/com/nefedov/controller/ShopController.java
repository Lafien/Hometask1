package com.nefedov.controller;

import com.nefedov.entity.Buyer;
import com.nefedov.entity.Shop;
import com.nefedov.service.BuyerService;
import com.nefedov.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShopController {

    @Autowired
    ShopService shopService;

    @GetMapping("/shop/findByName")
    public ResponseEntity<Shop> findByName(@RequestParam String name){
        List<Shop> list = shopService.retrieveByNameShop(name);

        if(list == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else {
            return ResponseEntity.ok(list.get(0));
        }
    }

    @DeleteMapping("/shop/deleteById")
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public void deleteById(@RequestParam int id){
        shopService.deleteById(id);
    }

    @GetMapping("/shop/getAll")
    public List<Shop> getAll(){
        List<Shop> list = shopService.getAll();
            return list;
    }

    @PatchMapping("/shop/setSomething")
    public void setSomething(@RequestParam String name, @RequestParam int id){
        shopService.setSomething(name, id);
    }

    @PostMapping("/shop/add")
    @ResponseStatus(code = HttpStatus.OK)
    public void add(String name,String locations,int commission){
        shopService.add(name, locations, commission);
    }

    @GetMapping("/shop/findById")
    public List<Shop> findById(int id){
        List<Shop> list = shopService.findById(id);
        return list;
    }

    @PutMapping("/shop/fullRewriting")
    @ResponseStatus(code = HttpStatus.OK)
    public void fullRewriting(int id, String name,String locations,int commission){
        shopService.fullRewriting(id, name, locations, commission);
    }


    @GetMapping("/shop/getNameMagSormSov")
    public List<String> getNameMagSormSov(){
        List<String> list = shopService.getNameMagSormSov();
        return list;
    }

    @GetMapping("/shop/getMagazineExceptAuvtoz")
    public List<Object> getMagazineExceptAuvtoz(){
        List<Object> list = shopService.getMagazineExceptAuvtoz();
        return list;
    }


}
