package com.library.service;

import com.library.model.Book;
import com.library.repository.BookRepository;

public class LibraryService {

    private BookRepository bookRepo;

    public LibraryService(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }

    public void addBook(Book book) {
        bookRepo.addBook(book);
    }

    public void borrowBook(String isbn) {
        Book book = bookRepo.findByIsbn(isbn);
        if (book != null && book.getAvailableCopies() > 0) {
            book.borrowCopy();
            System.out.println("Book borrowed!");
        } else {
            System.out.println("Book not available!");
        }
    }
}