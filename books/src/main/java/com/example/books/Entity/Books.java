package com.example.books.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bookId;

    private String bookName;
    private Double bookCost;
    private Integer quantity;
}
