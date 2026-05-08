package com.library;

import com.library.repository.BookRepository;
import com.library.service.LibraryService;
import com.library.ui.MenuController;

public class Main {
    public static void main(String[] args) {

        BookRepository repo = new BookRepository();
        LibraryService service = new LibraryService(repo);
        MenuController menu = new MenuController(service);

        menu.start();
    }
}
