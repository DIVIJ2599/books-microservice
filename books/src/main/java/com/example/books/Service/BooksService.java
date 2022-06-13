package com.example.books.Service;

import com.example.books.Entity.Books;
import com.example.books.Repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;

@Service
public class BooksService {

    @Autowired
    BooksRepository booksRepository;

    public void saveBook(Books books)
    {
        booksRepository.save(books);
    }

    public Double getBookPrice(String bookName,Integer quantity)
    {
        Books b = booksRepository.findByBookName(bookName);
        Double d = b.getBookCost();
        return d*quantity;
    }
    public Books getBook(String bookName)
    {
        return booksRepository.findByBookName(bookName);
    }
}
