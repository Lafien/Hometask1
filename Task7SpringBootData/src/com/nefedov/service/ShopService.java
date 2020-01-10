package com.nefedov.service;

import com.nefedov.entity.Book;
import com.nefedov.entity.Buy;
import com.nefedov.entity.Shop;
import com.nefedov.repository.BooksRepository;
import com.nefedov.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopService {

    @Autowired
    private ShopRepository shopRepository;

    public List<Shop> retrieveByNameShop(String nameShop){
        return shopRepository.retrieveByNameShop(nameShop);
    }

    public void deleteById(int id){
        shopRepository.deleteById(id);
    }

    public List<Shop> getAll(){
        return shopRepository.getAll();
    }

    public void setSomething(String name, int id){
        shopRepository.setSomething(name, id);
    }

    public void add(String name,String locations,int commission){
        shopRepository.add(name, locations, commission);
    }

    public List<Shop> findById(int id){
        return shopRepository.findById(id);
    }

    public void fullRewriting(int id, String name,String locations,int commission){
        shopRepository.fullRewriting(id, name, locations, commission);
    }

    public List<String> getNameMagSormSov(){
        return shopRepository.getNameMagSormSov();
    }

    public List<Object> getMagazineExceptAuvtoz(){
        return shopRepository.getMagazineExceptAuvtoz();
    }

}

