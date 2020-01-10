package com.nefedov.repository;

import com.nefedov.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.List;

public interface BooksRepository extends JpaRepository<Book, Integer> {


    @Query(value = "SELECT * FROM  books b WHERE b.name_book = :name", nativeQuery = true)
    List<Book> retrieveByName(@Param("name") String name);

    void deleteById(int id);

    @Query(value = "SELECT * FROM  books", nativeQuery = true)
    List<Book> getAll();

    @Transactional
    @Modifying
    @Query(value = "update books set name_book = :name where id_book = :id", nativeQuery = true)
    void setSomething(@Param("name") String bookName, @Param("id") int id);

    @Transactional
    @Modifying
    @Query(value = "insert into books(name_book, costs, warehouse, quantity)\n" +
            "    values (:name, :costs, :warehouse, :quantity)", nativeQuery = true)
    void add(@Param("name") String name, @Param("costs") int costs, @Param("warehouse") String warehouse, @Param("quantity") int quantity);

    List<Book> findById(int id);

    @Transactional
    @Modifying
    @Query(value = "update books set (name_book, costs, warehouse, quantity) = (:name, :costs, :warehouse, :quantity) where id_book =:id", nativeQuery = true)
    void fullRewriting(@Param("id") int id,@Param("name") String name, @Param("costs") int costs, @Param("warehouse") String warehouse, @Param("quantity") int quantity);

    @Query(value = "select distinct bk.name_book from books bk", nativeQuery = true)
    List<String> getAnyName();

    @Query(value = "select distinct bk.costs from books bk", nativeQuery = true)
    List<BigDecimal> getAnyCosts();

    @Query(value = "select bk.name_book as \"Название книги\", bk.costs as \"Стоимость книги\"\n" +
            "from books bk\n" +
            "where bk.costs >20000 or bk.name_book like '%Windows%'\n" +
            "order by bk.name_book, bk.costs desc", nativeQuery = true)
    List<Object> getNameWindows();

    @Query(value = "select br.surname as \"Фамилия покупателя\", bk.name_book as \"Название книги\", bk.warehouse as \"Район складирования\",\n" +
            "bk.quantity as \"Количество книг на складе\", b.summ as \"Стоимость покупки\"\n" +
            "from buy b, books bk, buyer br, shop s\n" +
            "where b.book = bk.id_book and b.buyer = br.id and b.seller = s.id_shop and s.locations = bk.warehouse and bk.quantity > 10\n" +
            "order by b.summ", nativeQuery = true)
    List<Object> getNameBookWarehouseQuantity();







}
