package com.nefedov.repository;

import com.nefedov.entity.Buyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
public interface BuyerRepository extends JpaRepository<Buyer, Integer> {

    //List<Buyer> findByName(String surname);

    @Query(value = "SELECT * FROM  buyer b WHERE b.surname = :surname", nativeQuery = true)
    List<Buyer> retrieveBySurname(@Param("surname") String surname);

    void deleteById(int id);

    @Query(value = "SELECT * FROM  buyer", nativeQuery = true)
    List<Buyer> getAll();

    @Transactional
    @Modifying
    @Query(value = "update buyer set surname = :surname where id = :id", nativeQuery = true)
    void setSomething(@Param("surname") String surname, @Param("id") int id);

    @Transactional
    @Modifying
    @Query(value = "insert into buyer(surname, residence, discount)\n" +
            "    values (:surname, :residence, :discount)", nativeQuery = true)
    void add(@Param("surname") String surname, @Param("residence") String residence, @Param("discount") int discount);

    List<Buyer> findById(int id);

    @Transactional
    @Modifying
    @Query(value = "update buyer set (surname, residence, discount) = (:surname, :residence, :discount) where id =:id", nativeQuery = true)
    void fullRewriting(@Param("id") int id, @Param("surname") String surname, @Param("residence") String residence, @Param("discount") int discount);

    @Query(value = "select distinct br.residence as \"Районы проживания\"\n" +
            "from buyer br", nativeQuery = true)
    List<String> getAnyResidence();


    @Query(value = "select *\n" +
            "from buyer br\n" +
            "where br.residence = 'Нижегородский'", nativeQuery = true)
    List<Buyer> getSurnameDiscount();

    @Query(value = "select  br.surname as \"Фамилия покупателя\", s.name_shop as \"Название магазина\"\n" +
            "from buy b, buyer br, shop s\n" +
            "where b.seller = s.id_shop and b.buyer = br.id ", nativeQuery = true)
    List<Object> getSurnameAndMagazine();



    @Query(value = "select br.surname as \"Фамилия покупателя\", br.residence as \"Район\", b.date_buy as \"Дата покупки\"\n" +
            "from buy b, buyer br, shop s\n" +
            "where b.buyer = br.id and b.seller = s.id_shop and s.locations = br.residence and b.date_buy >= '2019.04.01'\n" +
            "order by b.date_buy", nativeQuery = true)
    List<Object> getBuyerAfterMarch();

}
