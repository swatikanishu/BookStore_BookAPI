package com.example.bookstore_book.service;

import com.example.bookstore_book.dto.BookDto;
import com.example.bookstore_book.model.Book;

import java.util.List;

public interface IBookService {
    Book addBook(BookDto bookDTO);

    List<Book> findAll();

    Book FindById(Long bookid);

    String deleteById(Long bookid);

    Book findBookByName(String bookName);

    Book updateBookData(Long id, BookDto bookDTO);

    List<Book> sortPriceLowToHigh();

    List<Book> sortPriceHighToLow();

    Book changeBookQty(Long bookid, int bookQuantity);
}

