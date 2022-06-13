package com.example.books.Repository;

import com.example.books.Entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Books,Integer> {
    Books findByBookName(String bookName);
}
