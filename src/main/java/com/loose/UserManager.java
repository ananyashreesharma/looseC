package com.loose;

import com.tight.UserDatabase;

public class UserManager {
    private com.tight.UserDatabase userDatabase = new UserDatabase();
    public String getDetails(){
        return userDatabase.getUserDetails();
    }
}
