package org.example;

import org.example.utils.*;


public class Main {

    public static void main(String[] args) {

        PrepareDatabase prepareDatabase = new PrepareDatabase();
        prepareDatabase.postAllObjectsToDb();
    }

}
