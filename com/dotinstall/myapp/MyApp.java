package com.dotinstall.myapp;
import com.dotinstall.myapp.model.User;
import com.dotinstall.myapp.model.AdminUser;
import com.dotinstall.myapp.model.AmericanUser;
import com.dotinstall.myapp.model.JapaneseUser;


public class MyApp {

    public static void main(String[] args) {
        User tom = new User();
        tom.print();
        tom.getInfo();
    }
}