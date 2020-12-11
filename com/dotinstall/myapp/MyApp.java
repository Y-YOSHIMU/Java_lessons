package com.dotinstall.myapp;
import com.dotinstall.myapp.model.User;
import com.dotinstall.myapp.model.AdminUser;
import com.dotinstall.myapp.model.AmericanUser;
import com.dotinstall.myapp.model.JapaneseUser;

// source .bash_profile

// ArrayList
// LinkedList x 検索 ◯　追加/削除
import java.util.*;

public class MyApp {

    public static void main(String[] args) {
        // ArrayList<Integer> sales = new ArrayList<>();
        List<Integer> sales = new ArrayList<>();

        sales.add(10);
        sales.add(20);
        sales.add(30);

        for (int i = 0; i < sales.size(); i++) {
            System.out.println(sales.get(i));
        }

        sales.set(0, 100);
        sales.remove(2);

        for (Integer sale : sales) {
            System.out.println(sale);
        }
        
    }
}