package com.loose;

import com.tight.UserManager;

public class LooseCoupling {
    public static void main(String args[]){
         UserManager userM=new UserManager();
        System.out.println(userM.getDetails());
    }
}
