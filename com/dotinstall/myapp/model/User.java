package com.dotinstall.myapp.model;

//initializer

public class User {
    private String name;
    private static int count; // クラス変数

    static {
        User.count = 0;
        System.out.println("Static initializer");
    }

    {
        System.out.println("Instance initializer");
    }

    public User(String name) {
        this.name = name;
        User.count++;
        System.out.println("Constructor");
    }

    public static void getInfo() { // クラスメソッド
        System.out.println("# of instances: " + User.count);
    }
}
