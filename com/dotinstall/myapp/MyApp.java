package com.dotinstall.myapp;
import com.dotinstall.myapp.model.User;
import com.dotinstall.myapp.model.AdminUser;
import com.dotinstall.myapp.model.AmericanUser;
import com.dotinstall.myapp.model.JapaneseUser;

// 列挙型

enum Result {
    SUCCESS, // 0
    ERROR, // 1
}

public class MyApp {

    public static void main(String[] args) {
        Result res;

        res = Result.SUCCESS;

        switch (res) {
            case SUCCESS:
                System.out.println("OK!");
                System.out.println(res.ordinal()); // 0
                break;
            case ERROR:
                System.out.println("NG!");
                System.out.println(res.ordinal()); // 1
                break;
        }
    }
}