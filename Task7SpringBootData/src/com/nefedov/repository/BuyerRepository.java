package com.nefedov.repository;

import com.nefedov.entity.Buyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface BuyerRepository extends JpaRepository<Buyer, Integer> {

    //List<Buyer> findByName(String surname);

    @Query(value = "SELECT * FROM  buyer b WHERE b.surname = :surname", nativeQuery = true)
    List<Buyer> retrieveBySurname(@Param("surname") String surname);
}
