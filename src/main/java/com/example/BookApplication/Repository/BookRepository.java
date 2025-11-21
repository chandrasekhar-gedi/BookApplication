package com.example.BookApplication.Repository;

import com.example.BookApplication.Entity.Book;
import org.hibernate.annotations.processing.Find;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book ,Integer> {
    public Book findByBooktitle(String title);

}
