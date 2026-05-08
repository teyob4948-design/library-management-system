package com.library.model;

import java.time.LocalDateTime;

public abstract class LibraryItem {
    protected String id;
    protected String title;
    protected LocalDateTime createdAt;

    public LibraryItem(String id, String title) {
        this.id = id;
        this.title = title;
        this.createdAt = LocalDateTime.now();
    }

    public String getId() { return id; }
    public String getTitle() { return title; }

    public abstract String getDetails();
}
