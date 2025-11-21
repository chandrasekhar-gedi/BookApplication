package com.example.BookApplication.Controller;

import com.example.BookApplication.Entity.Book;
import com.example.BookApplication.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book/v1")
public class BookController{
   private final BookService bookService;
   @Autowired
   public BookController(BookService bookService) {
       this.bookService = bookService;
   }
    @PostMapping("/addBook")
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
       Book savedBook = bookService.addBook(book);
    return  ResponseEntity.ok(savedBook);
    }
    @GetMapping("/getbook/{bookName}")
    public ResponseEntity<Book> getBooksByName(@RequestParam("bookName")String name) {
      final Book bookByName=bookService.getBookByName(name);
      return ResponseEntity.ok(bookByName);
    }
}
