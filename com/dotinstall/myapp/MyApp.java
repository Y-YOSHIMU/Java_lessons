package com.dotinstall.myapp;
import com.dotinstall.myapp.model.User;
import com.dotinstall.myapp.model.AdminUser;
import com.dotinstall.myapp.model.AmericanUser;
import com.dotinstall.myapp.model.JapaneseUser;

// generics

// class MyInteger {
//     public void getThree(int x) {
//         System.out.println(x);
//         System.out.println(x);
//         System.out.println(x);
//     }
// }

class MyData<T> {
    public void getThree(T x) {
        System.out.println(x);
        System.out.println(x);
        System.out.println(x);
    }
}

public class MyApp {

    public static void main(String[] args) {
        // MyInteger mi = new MyInteger();
        // mi.getThree(55);
        MyData<Integer> i = new MyData<>();
        i.getThree(32);
        MyData<String> s = new MyData<>();
        s.getThree("hello");
    }
}