package com.dotinstall.myapp;
import com.dotinstall.myapp.model.User;
import com.dotinstall.myapp.model.AdminUser;
import com.dotinstall.myapp.model.AmericanUser;
import com.dotinstall.myapp.model.JapaneseUser;

// source .bash_profile

import java.util.*;
// HashMap: key value データの順番が不定
// TreeMap key順
// LinkedHashMap データが追加された順番

public class MyApp {

    public static void main(String[] args) {
        // HashMap<String, Integer> sales = new HashMap<>();
        Map<String, Integer> sales = new HashMap<>();

        sales.put("tom", 10);
        sales.put("bob", 20);
        sales.put("steve", 30);

        System.out.println(sales.get("tom")); // 10
        System.out.println(sales.size()); // 3

        for (Map.Entry<String, Integer> sale : sales.entrySet()) {
            System.out.println(sale.getKey() + ":" + sale.getValue());
        }

        sales.put("tom", 100);
        sales.remove("steve");

        for (Map.Entry<String, Integer> sale : sales.entrySet()) {
            System.out.println(sale.getKey() + ":" + sale.getValue());
        }
    }
}