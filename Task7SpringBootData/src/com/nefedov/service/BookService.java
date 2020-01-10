package com.nefedov.service;

import com.nefedov.entity.Book;
import com.nefedov.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BooksRepository booksRepository;


    public List<Book> retrieveByName(String name){
        return booksRepository.retrieveByName(name);
    }

    public void deleteById(int id){
        booksRepository.deleteById(id);
    }

    public List<Book> getAll(){
       return booksRepository.getAll();
    }

    public void setSomething(String bookName, int id){
        booksRepository.setSomething(bookName, id);
    }

    public void add(String name, int costs, String warehouse,int quantity){
     booksRepository.add(name, costs, warehouse, quantity);
    }

    public List<Book> findById(int id){
        return booksRepository.findById(id);
    }

    public void fullRewriting(int id, String name, int costs, String warehouse,int quantity){
        booksRepository.fullRewriting(id, name, costs, warehouse, quantity);
    }

    public List<String> getAnyName(){
        return booksRepository.getAnyName();
    }

    public List<BigDecimal> getAnyCosts(){
        return booksRepository.getAnyCosts();
    }

    public List<Object> getNameWindows(){
        return booksRepository.getNameWindows();
    }

    public List<Object> getNameBookWarehouseQuantity(){
        return booksRepository.getNameBookWarehouseQuantity();
    }


}

