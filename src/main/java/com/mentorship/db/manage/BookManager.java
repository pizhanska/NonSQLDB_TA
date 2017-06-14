package com.mentorship.db.manage;

import com.mentorship.db.model.Book;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;

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
}
