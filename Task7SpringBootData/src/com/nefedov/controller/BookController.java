package com.nefedov.controller;

import com.nefedov.entity.Book;
import com.nefedov.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/find/book")
    public ResponseEntity<Book> findById(@RequestParam String name){
        List<Book> list = bookService.retrieveByName(name);

        if(list == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else {
            return ResponseEntity.ok(list.get(0));
        }
    }

    @DeleteMapping("/delete/book")
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public void deleteById(@RequestParam int id){
        bookService.deleteById(id);
    }

    @GetMapping("/find/getall")
    public List<Book> getAll(){
        List<Book> list = bookService.getAll();
            return list;
    }

    @PatchMapping("/update/book")
    public void setSomething(@RequestParam String columnName, @RequestParam int id){
        bookService.setSomething(columnName, id);
    }




}
