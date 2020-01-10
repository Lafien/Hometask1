package com.nefedov.controller;

import com.nefedov.entity.Book;
import com.nefedov.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/book/findByName")
    public ResponseEntity<Book> findByName(@RequestParam String name){
        List<Book> list = bookService.retrieveByName(name);

        if(list == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else {
            return ResponseEntity.ok(list.get(0));
        }
    }

    @DeleteMapping("/book/deleteById")
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public void deleteById(@RequestParam int id){
        bookService.deleteById(id);
    }

    @GetMapping("/book/getall")
    public List<Book> getAll(){
        List<Book> list = bookService.getAll();
            return list;
    }

    @PatchMapping("/book/setSomething")
    public void setSomething(@RequestParam String nameBook, @RequestParam int id){
        bookService.setSomething(nameBook, id);
    }

    @PostMapping("/book/add")
    @ResponseStatus(code = HttpStatus.OK)
    public void add(String name, int costs, String warehouse,int quantity){
        bookService.add(name, costs, warehouse, quantity);
    }

    @GetMapping("/book/findById")
    public List<Book> findById(int id){
        List<Book> list = bookService.findById(id);
        return list;
    }

    @PutMapping("/book/fullRewriting")
    @ResponseStatus(code = HttpStatus.OK)
    public void fullRewriting(int id, String name, int costs, String warehouse,int quantity){
        bookService.fullRewriting(id, name, costs, warehouse, quantity);
    }

    @GetMapping("/book/getAnyName")
    public List<String> getAnyName(){
        List<String> list = bookService.getAnyName();
        return list;
    }

    @GetMapping("/book/getAnyCosts")
    public List<BigDecimal> getAnyCosts(){
        List<BigDecimal> list = bookService.getAnyCosts();
        return list;
    }


    @GetMapping("/book/getNameWindows")
    public List<Object> getNameWindows(){
        List<Object> list = bookService.getNameWindows();
        return list;
    }

    @GetMapping("/book/getNameBookWarehouseQuantity")
    public List<Object> getNameBookWarehouseQuantity(){
        List<Object> list = bookService.getNameBookWarehouseQuantity();
        return list;
    }


}
