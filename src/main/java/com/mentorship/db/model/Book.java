package com.mentorship.db.model;

/**
 * Created by Uliana Pizhanska on 14/06/2017.
 */
public class Book {
    private String title;
    private String author;
    private int wasPublished;

    public String getTitle() {
        return title;
    }

    public Book(String title, String author, int wasPublished) {
        super();
        this.title = title;
        this.author = author;
        this.wasPublished = wasPublished;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getWasPublished() {
        return wasPublished;
    }

    public void setWasPublished(int wasPublished) {
        this.wasPublished = wasPublished;
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", wasPublished=" + wasPublished +
                '}';
    }
}


