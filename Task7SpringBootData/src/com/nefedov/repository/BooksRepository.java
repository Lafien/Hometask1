package com.nefedov.repository;

import com.nefedov.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface BooksRepository extends JpaRepository<Book, Integer> {

    List<Book> findByName(String name);

    @Query(value = "SELECT * FROM  books b WHERE b.name_book = :name", nativeQuery = true)
    List<Book> retrieveByName(@Param("name") String name);

    public void deleteById(int id);

    @Query(value = "SELECT * FROM  books", nativeQuery = true)
    List<Book> getAll();

    @Transactional
    @Modifying
    @Query(value = "update books set name_book = :name where id_book = :id", nativeQuery = true)
    public void setSomething(@Param("names") String columnName, @Param("id") int id);
}
