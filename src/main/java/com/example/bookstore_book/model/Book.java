package com.example.bookstore_book.model;

import com.example.bookstore_book.dto.BookDto;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor

@Table(name="Book")
public class Book {
    /**
     * variables
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bookId", nullable = false)
    private Long bookId;

    @Column(name="book_name")
    private String bookName;
    private String authorName;
    private int bookQuantity;
    private int price;
    private String Bookimage;
    private String bookDescription;

    // parameterized constructor
    public Book(BookDto bookDto) {
        this.bookName = bookDto.getBookName();
        this.authorName = bookDto.getAuthorName();
        this.bookQuantity = bookDto.getBookQuantity();
        this.price = bookDto.getPrice();
        this.Bookimage=bookDto.getBookimage();
        this.bookDescription =bookDto.getBookDescription();
    }

}
