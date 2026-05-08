package com.library.ui;

import com.library.model.Book;
import com.library.service.LibraryService;

import java.util.Scanner;

public class MenuController {

    private LibraryService service;
    private Scanner scanner = new Scanner(System.in);

    public MenuController(LibraryService service) {
        this.service = service;
    }

    public void start() {
        while (true) {
            System.out.println("\n1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addBook();
                case 2 -> borrowBook();
                case 3 -> System.exit(0);
            }
        }
    }

    private void addBook() {
        System.out.print("Title: ");
        String title = scanner.nextLine();

        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();

        Book book = new Book("1", title, isbn, "Author", "Genre", 2020, 3);
        service.addBook(book);

        System.out.println("Book added!");
    }

    private void borrowBook() {
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();

        service.borrowBook(isbn);
    }
}
