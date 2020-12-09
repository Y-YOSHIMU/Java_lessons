package com.dotinstall.myapp.model;
// interface

public interface Printable {
    // 定数
    double VERSION = 1.2;
    // 抽象メソッド
    void print();
    // defaultメソッド
    public default void getInfo() {
        System.out.println("I/F ver. " + Printable.VERSION);
    }
    // staticメソッド
}
