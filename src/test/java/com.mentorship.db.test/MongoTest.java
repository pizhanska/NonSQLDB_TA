package com.mentorship.db.test;

import com.lordofthejars.nosqlunit.annotation.ShouldMatchDataSet;
import com.lordofthejars.nosqlunit.annotation.UsingDataSet;
import com.lordofthejars.nosqlunit.core.LoadStrategyEnum;
import com.lordofthejars.nosqlunit.mongodb.MongoDbConfigurationBuilder;
import com.lordofthejars.nosqlunit.mongodb.MongoDbRule;
import com.mentorship.db.manage.BookManager;
import com.mentorship.db.model.Book;
import static org.junit.Assert.*;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.internal.MethodSorter;
import org.junit.runners.MethodSorters;

import java.util.List;

/**
 * Created by Uliana Pizhanska on 31/05/2017.
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MongoTest {
    private  static BookManager bookManager = null;
    @Rule
    public MongoDbRule remoteMongoDbRule = new MongoDbRule(MongoDbConfigurationBuilder.mongoDb().databaseName("book").build());

    @BeforeClass
    public static void setUp(){
        bookManager = new BookManager(MongoDBUtil.getCollection(Book.class.getSimpleName()));
    }

    @Test
    @UsingDataSet(loadStrategy = LoadStrategyEnum.DELETE_ALL)
    public void addBook() {

        Book book = new Book("The Lord Of The Rings", "J. R. R. Tolkien", 1954);
        bookManager.create(book);
        assertThat(bookManager.findAll(), hasSize(1));
    }

    @Test
    public void getAllBooks(){
        List<Book> bookList = bookManager.findAll();
        for (Book book : bookList){
            System.out.println(book);
        }
        assertNotNull(bookList);
        assertEquals("The Lord Of The Rings",bookList.get(0).getTitle());

    }

}
