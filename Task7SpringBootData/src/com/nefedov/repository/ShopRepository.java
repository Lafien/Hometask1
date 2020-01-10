package com.nefedov.repository;

import com.nefedov.entity.Book;
import com.nefedov.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ShopRepository extends JpaRepository<Shop, Integer> {

    //List<Shop> findByNameShop(String nameShop);

    @Query(value = "SELECT * FROM  shop b WHERE b.name_shop = :name_shop", nativeQuery = true)
    List<Shop> retrieveByNameShop(@Param("name_shop") String nameShop);

    void deleteById(int id);

    @Query(value = "SELECT * FROM  shop", nativeQuery = true)
    List<Shop> getAll();

    @Transactional
    @Modifying
    @Query(value = "update shop set name_shop = :name where id_shop = :id", nativeQuery = true)
    void setSomething(@Param("name") String name, @Param("id") int id);

    @Transactional
    @Modifying
    @Query(value = "insert into shop(name_shop, locations, commission)\n" +
            "    values (:name, :locations, :commission)", nativeQuery = true)
    void add(@Param("name") String name, @Param("locations") String locations, @Param("commission") int commission);

    List<Shop> findById(int id);

    @Transactional
    @Modifying
    @Query(value = "update shop set (name_shop, locations, commission) = (:name, :locations, :commission) where id_shop =:id", nativeQuery = true)
    void fullRewriting(@Param("id") int id, @Param("name") String name, @Param("locations") String locations, @Param("commission") int commission);




    @Query(value = "select s.name_shop as \"Название магазина\"\n" +
            "    from shop s\n" +
            "    where s.locations = 'Сормовский' or s.locations = 'Советский'", nativeQuery = true)
    List<String> getNameMagSormSov();

    @Query(value = "select s.name_shop as \"Название магазина\", s.locations as \"Район магазина\", br.surname as \"Фамилия покупателя\",\n" +
            "br.discount as \"Скидка\"\n" +
            "from shop s, buyer br, buy b\n" +
            "where s.locations !='Автозаводский' and br.discount >=10 and br.discount <=15 and b.seller = s.id_shop and b.buyer = br.id", nativeQuery = true)
    List<Object> getMagazineExceptAuvtoz();


}
