package com.mentorship.db.test;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

/**
 * Created by Uliana Pizhanska on 14/06/2017.
 */
public class MongoDBUtil {
    private static DB database;


    public static DBCollection getCollection(String collectionName){
        try {
            MongoClient mongo = new MongoClient("localhost", 27017);
            database = mongo.getDB("book");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return database.getCollection(collectionName);
    }

}
