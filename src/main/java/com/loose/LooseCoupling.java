package com.loose;

import com.tight.UserManager;

public class LooseCoupling {
    public static void main(String args[]){
         UserDataProvider databaseProvider = new UserDatabaseProvider();
    }
}
