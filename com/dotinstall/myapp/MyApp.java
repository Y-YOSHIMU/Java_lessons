package com.dotinstall.myapp;
import com.dotinstall.myapp.model.User;
import com.dotinstall.myapp.model.AdminUser;
import com.dotinstall.myapp.model.AmericanUser;
import com.dotinstall.myapp.model.JapaneseUser;

// source .bash_profile

import java.util.*;

// Stream API

public class MyApp {

    public static void main(String[] args) {
        List<Integer> sales = new ArrayList<>(Arrays.asList(12, 30, 22, 4, 9));
        // for (Integer sale : sales) {
        //     System.out.println(sale);
        // }

        sales
          .stream()
          // 中間処理
          .filter(e -> e % 3 == 0) // ラムダ式 引数 -> 処理
          .map(e -> "(" + e + ")")
          // 終端処理
          .forEach(System.out::println);
    }
}