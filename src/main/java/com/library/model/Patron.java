package com.library.model;

import java.util.ArrayList;
import java.util.List;

public class Patron extends Person {
    private List<String> borrowedBookIds = new ArrayList<>();

    public Patron(String id, String name, String email, String phone) {
        super(id, name, email, phone);
    }

    public List<String> getBorrowedBookIds() {
        return borrowedBookIds;
    }
}
