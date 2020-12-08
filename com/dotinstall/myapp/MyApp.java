package com.dotinstall.myapp;
import com.dotinstall.myapp.model.User;
import com.dotinstall.myapp.model.AdminUser;
// import com.dotinstall.myapp.model.*; ワイルドカード model.以下全て

public class MyApp {

    public static void main(String[] args) {
        User tom = new User("Tom", 65);
        tom.setScore(85);
        tom.setScore(-22);
        System.out.println(tom.getScore());
    }
}