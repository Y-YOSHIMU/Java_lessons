package com.dotinstall.myapp.model;

//static

public class User {
    private String name;
    private static int count = 0; // クラス変数

    public User(String name) {
        this.name = name;
        User.count++;
    }

    public static void getInfo() { // クラスメソッド
        System.out.println("# of instances: " + User.count);
    }
}
