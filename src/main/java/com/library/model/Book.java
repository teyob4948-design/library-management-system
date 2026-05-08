package com.library.model;

public class Book extends LibraryItem {
    private String isbn;
    private String author;
    private String genre;
    private int year;
    private int totalCopies;
    private int availableCopies;

    public Book(String id, String title, String isbn, String author,
                String genre, int year, int copies) {
        super(id, title);
        this.isbn = isbn;
        this.author = author;
        this.genre = genre;
        this.year = year;
        this.totalCopies = copies;
        this.availableCopies = copies;
    }

    public String getIsbn() { return isbn; }
    public int getAvailableCopies() { return availableCopies; }

    public void borrowCopy() {
        if (availableCopies > 0) {
            availableCopies--;
        }
    }

    public void returnCopy() {
        availableCopies++;
    }

    @Override
    public String getDetails() {
        return title + " by " + author + " (Available: " + availableCopies + ")";
    }
}
