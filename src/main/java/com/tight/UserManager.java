package com.tight;

public class UserManager {
    private UserDatabase userDatabase = new UserDatabase();
    public String getDetails(){
        return userDatabase.getUserDetails();
    }
}
