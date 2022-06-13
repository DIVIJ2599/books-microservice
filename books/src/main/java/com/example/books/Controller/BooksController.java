package com.example.books.Controller;

import com.example.books.Entity.Books;
import com.example.books.Service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;

@RestController
public class BooksController {

    @Autowired
    BooksService booksService;


    @PostMapping("/books")
    public void createBook(@RequestBody Books books)
    {
        booksService.saveBook(books);
    }
    @GetMapping("/studentService/getbookcost/{bookname}/quantity/{quantity}")
    public Double getBookCost(@PathVariable String bookname,@PathVariable Integer quantity) {
        return booksService.getBookPrice(bookname,quantity);
    }
}
