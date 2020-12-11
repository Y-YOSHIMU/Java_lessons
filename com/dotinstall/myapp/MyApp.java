package com.dotinstall.myapp;
import com.dotinstall.myapp.model.User;
import com.dotinstall.myapp.model.AdminUser;
import com.dotinstall.myapp.model.AmericanUser;
import com.dotinstall.myapp.model.JapaneseUser;

// source .bash_profile

// HashSetクラス 順番不定
// TreeSet 値順にソート
// LinkedHashSet 追加された順に保持

import java.util.*;

public class MyApp {

    public static void main(String[] args) {

        // HashSet<Integer> sales = new HashSet<>();
        Set<Integer> sales = new HashSet<>();

        sales.add(10);
        sales.add(20);
        sales.add(30);
        sales.add(10);

        System.out.println(sales.size()); // 3

        for (Integer sale : sales) {
            System.out.println(sale);
        }

        sales.remove(30);

        for (Integer test : sales) {
            System.out.println(test);
        }
    }
}