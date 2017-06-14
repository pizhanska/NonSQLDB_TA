package com.mentorship.db.test;

import com.mentorship.db.manage.BookManager;
import com.mentorship.db.model.Book;
import org.junit.Test;

/**
 * Created by Uliana Pizhanska on 31/05/2017.
 */
public class MongoTest {
    @Test
    public void book_should_be_inserted_into_repository() {

        BookManager bookManager = new BookManager(MongoDBUtil.getCollection(Book.class.getSimpleName()));

        Book book = new Book("The Lord Of The Rings", "J. R. R. Tolkien",1954);
        bookManager.create(book);

    }
}
