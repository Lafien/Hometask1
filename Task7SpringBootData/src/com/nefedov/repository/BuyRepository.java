package com.nefedov.repository;

import com.nefedov.entity.Book;
import com.nefedov.entity.Buy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BuyRepository extends JpaRepository<Buy, Integer> {

    //List<Buy> findByName(String name);

    List<Buy> findById(int id);


    /*@Query(value = "SELECT * FROM  buy b WHERE b.name_book = :name", nativeQuery = true)
    List<Buy> retrieveByName(@Param("name") String name);*/
}
