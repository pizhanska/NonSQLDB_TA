package com.mentorship.db.manage;

import com.mentorship.db.model.Book;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Uliana Pizhanska on 14/06/2017.
 */
public class BookManager {
    private DBCollection booksCollection;
    private MongoBook mongoBook =  new MongoBook();

    public BookManager(DBCollection booksCollection) {
        this.booksCollection = booksCollection;
    }

    public void create(Book book) {
        DBObject dbObject = mongoBook.convert(book);
        booksCollection.insert(dbObject);
    }


    public List<Book> findAll() {

        List<Book> books = new ArrayList<Book>();
        DBCursor findAll = booksCollection.find();

        while(findAll.hasNext()) {
            books.add(mongoBook.convert(findAll.next()));
        }
        return books;
    }
}
