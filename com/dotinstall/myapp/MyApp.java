package com.dotinstall.myapp;
import com.dotinstall.myapp.model.User;
import com.dotinstall.myapp.model.AdminUser;
import com.dotinstall.myapp.model.AmericanUser;
import com.dotinstall.myapp.model.JapaneseUser;

// source .bash_profile

// Math,Randomクラス
import java.util.Random;

public class MyApp {

    public static void main(String[] args) {
        double d = 53.234;
        System.out.println(Math.ceil(d)); // 54 小数点切り上げ
        System.out.println(Math.floor(d)); // 53 小数点切り捨て
        System.out.println(Math.round(d)); // 53 四捨五入
        System.out.println(Math.PI); // 円周率取得
        // Math.random()

        Random r = new Random();
        System.out.println(r.nextDouble()); // 0以上1未満
        System.out.println(r.nextInt(100)); // 0以上100未満の整数
        System.out.println(r.nextBoolean()); // ランダムなtrue,false
    }
}