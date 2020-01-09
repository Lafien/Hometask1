package com.nefedov.repository;

import com.nefedov.entity.Book;
import com.nefedov.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ShopRepository extends JpaRepository<Shop, Integer> {

    //List<Shop> findByNameShop(String nameShop);

    @Query(value = "SELECT * FROM  shop b WHERE b.name_shop = :name_shop", nativeQuery = true)
    List<Shop> retrieveByNameShop(@Param("name_shop") String nameShop);
}
