package com.nefedov.repository;

import com.nefedov.entity.Book;
import com.nefedov.entity.Buy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.List;

public interface BuyRepository extends JpaRepository<Buy, Integer> {


    void deleteById(int id);

    @Query(value = "SELECT * FROM  buy", nativeQuery = true)
    List<Buy> getAll();

    @Transactional
    @Modifying
    @Query(value = "update buy set summ = :summ where id_number = :id", nativeQuery = true)
    void setSomething(@Param("summ") int summ, @Param("id") int id);

    @Transactional
    @Modifying
    @Query(value = "insert into buy(date_buy,seller, buyer, book, amount, summ)\n" +
            "    values (:dateBuy, :seller, :buyer, :book, :amount, :summ)", nativeQuery = true)
    void add(@Param("dateBuy") Date dateBuy, @Param("seller") int seller, @Param("buyer") int buyer, @Param("book") int book, @Param("amount") int amount, @Param("summ") int summ);

    List<Buy> findById(int id);

    @Transactional
    @Modifying
    @Query(value = "update buy set (date_buy,seller, buyer, book, amount, summ) =" +
            " (:dateBuy, :seller, :buyer, :book, :amount, :summ) where id_number =:id", nativeQuery = true)
    void fullRewriting(@Param("id") int id, @Param("dateBuy") Date dateBuy, @Param("seller") int seller,
                       @Param("buyer") int buyer, @Param("book") int book, @Param("amount") int amount, @Param("summ") int summ);

    @Query(value = "select distinct(extract(month from b.date_buy)) as Месяц\n" +
            "from buy b", nativeQuery = true)
    List<Double> getAnyMonth();

    @Query(value = "select b.date_buy as \"Дата покупки\", br.surname as \"Фамилия покупателя\", br.discount as \"Скидка\", bk.name_book as \"Название книги\",\n" +
            "b.amount as \"Количество купленных книг\"\n" +
            "from buy b, buyer br, books bk\n" +
            "where b.buyer = br.id and b.book = bk.id_book", nativeQuery = true)
    List<Object> getDateSurnameDiscount();

    @Query(value = "select b.id_number as \"Номер заказа\", br.surname as \"Фамилия покупателя\", b.date_buy as \"Дата покупки\", b.summ as \"Сумма покупки\"\n" +
            "from buy b, buyer br\n" +
            "where b.buyer = br.id and b.summ >=60000", nativeQuery = true)
    List<Object> getTicketSurnameDateBigBuy();
}
