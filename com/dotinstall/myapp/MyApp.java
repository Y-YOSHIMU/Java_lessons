package com.dotinstall.myapp;
import com.dotinstall.myapp.model.User;
import com.dotinstall.myapp.model.AdminUser;
import com.dotinstall.myapp.model.AmericanUser;
import com.dotinstall.myapp.model.JapaneseUser;

/*
Wrapper Class
int -> Integer
double -> Double
*/

public class MyApp {

    public static void main(String[] args) {
        // Integer i = new Integer(32);
        // int n = i.intValue();

        Integer i = 31; // auto boxing
        i = null;
        int n = i; // auto unboxing

        System.out.println(i);
    }
}