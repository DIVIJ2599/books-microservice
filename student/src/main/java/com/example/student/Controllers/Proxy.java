package com.example.student.Controllers;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.awt.print.Book;

@FeignClient(name = "books-microservice")
public interface Proxy {

    @GetMapping("/bookservice/getbookcost/{bookname}")
    public Book retrieveBookCost(@PathVariable String bookName);
}
