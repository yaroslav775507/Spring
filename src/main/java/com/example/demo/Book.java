package com.example.demo;

public class Book {
    private final int id;
    private String title;
    private String author;
    private String publisher;
    private int year;
    private double coast;

    public Book(int id, String title, String author, String publisher, int year, double coast) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.coast = coast;
    }
}
