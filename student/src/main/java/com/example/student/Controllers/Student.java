package com.example.student.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.books.entity.Books;


@RestController
public class Student {

    @Autowired
    Proxy proxy;

    @GetMapping("/studentservice/findCost/{bookname}/quantity/{quantity}")
    public Books getTotalCost(@PathVariable String bookname, @PathVariable Double quantity)
    {
        Books books = proxy.retrieveBookCost(bookname);
        return new Books(
                books.getBookId(),
                book.getBookName(),
                book.getBookCost(),
                quantity,
                quantity.multiply(book.getBookCost()),
                book.getEnvironment()
        );
    }

}
