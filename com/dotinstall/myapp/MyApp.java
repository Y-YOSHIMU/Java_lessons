package com.dotinstall.myapp;
import com.dotinstall.myapp.model.User;
import com.dotinstall.myapp.model.AdminUser;
// import com.dotinstall.myapp.model.*; ワイルドカード model.以下全て

public class MyApp {

    public static void main(String[] args) {
        User.getInfo(); // 0
        User tom = new User("Tom");
        User.getInfo(); // 1
        User bob = new User("Bob");
        User.getInfo(); // 2
    }
}