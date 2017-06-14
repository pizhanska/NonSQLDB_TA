package com.mentorship.db.test;

import com.mongodb.DB;

/**
 * Created by Uliana Pizhanska on 14/06/2017.
 */
public class MongoDBUtil {
    private static DB database;


    static{
        M mongo=new MongoClient("localhost",27017);
        database=mongo.getDB("test");
    }

    public static DBCollection getCollection(String collectionName){
        MongoC
        return database.getCollection(collectionName);
    }

}
