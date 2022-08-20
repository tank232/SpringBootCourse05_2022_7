package com.av.dao;

import com.av.domain.Book;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {

    @EntityGraph(
            attributePaths = {"title"}
    )
    List<Book> findAll();


    Optional<Book> findBookByTitle(String title);


}
