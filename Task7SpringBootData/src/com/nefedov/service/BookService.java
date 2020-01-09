package com.nefedov.service;

import com.nefedov.entity.Book;
import com.nefedov.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BooksRepository booksRepository;

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

    public List<Book> retrieveByName(String name){
        return booksRepository.retrieveByName(name);
    }

    public void deleteById(int id){
        booksRepository.deleteById(id);
    }

    public List<Book> getAll(){
       return booksRepository.getAll();
    }

    public void setSomething(String columnName, int id){
        booksRepository.setSomething(columnName, id);
    }

}

