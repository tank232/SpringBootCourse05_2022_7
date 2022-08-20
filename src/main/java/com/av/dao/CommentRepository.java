package com.av.dao;


import com.av.domain.Author;
import com.av.domain.Book;
import com.av.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    @Override
    List<Comment> findAll();


    Optional<Comment> findCommentByBook(Book book);


}
