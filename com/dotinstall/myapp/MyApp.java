package com.dotinstall.myapp;
import com.dotinstall.myapp.model.User;
import com.dotinstall.myapp.model.AdminUser;
import com.dotinstall.myapp.model.AmericanUser;
import com.dotinstall.myapp.model.JapaneseUser;

// Thread

// class MyRunnable implements Runnable { // 関数型インターフェース
//     @Override
//     public void run() {
//         for (int i = 0; i < 100; i++) {
//             System.out.print('*');
//         }
//     }
// }

public class MyApp {

    public static void main(String[] args) {
        // MyRunnable r = new MyRunnable();
        // Thread t = new Thread(r);
        // t.start();

        // new Thread(new MyRunnable()).start(); // 無名クラス
        
        // new Thread(new Runnable() {
        //     @Override
        //     public void run() {
        //         for (int i = 0; i < 100; i++) {
        //             System.out.print('*');
        //         }
        //     }
        // }).start();

        // ラムダ式
        // (引数) -> {処理}        

        new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                System.out.print('*');
            }
        }).start();

        for (int i = 0; i < 500; i++) {
            System.out.print('.');
        }
    }
}