package com.mentorship.db.manage;

import ch.lambdaj.function.convert.Converter;
import com.mentorship.db.model.Book;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

/**
 * Created by Uliana Pizhanska on 14/06/2017.
 */
public class MongoBook implements Converter<Book,DBObject> {
    public static final String TITLE_FIELD = "title";
    public static final String AUTHOR_FIELD = "author";
    public static final String WAS_PUBLISHED_FIELD = "wasPublished";


    public DBObject convert(Book book) {

        DBObject dbObject = new BasicDBObject();

        dbObject.put(TITLE_FIELD, book.getTitle());
        dbObject.put(AUTHOR_FIELD, book.getAuthor());
        dbObject.put(WAS_PUBLISHED_FIELD, book.getWasPublished());

        return dbObject;
    }
}
