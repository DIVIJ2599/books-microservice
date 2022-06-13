package com.example.student.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {
    private Integer bookId;
    private String bookName;
    private Double bookCost;
    private Double quantity;
    private Double totalCost;
    private String environment;
}
