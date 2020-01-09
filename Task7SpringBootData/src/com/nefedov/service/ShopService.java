package com.nefedov.service;

import com.nefedov.entity.Book;
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

    /*public List<Employee> findAll(){
        return employeeRepository.findAll();
    }

    public Employee findById(int id){
        Optional<Employee> optional = employeeRepository.findById(id);
        return optional.orElse(new Employee());
    }*/

    /*public List<Employee> findByName(String name){
        return employeeRepository.findByName(name);
    }*/

    /*public void save(Employee employee){
        employeeRepository.save(employee);
    }*/

    public List<Shop> retrieveByNameShop(String nameShop){
        return shopRepository.retrieveByNameShop(nameShop);
    }

}

