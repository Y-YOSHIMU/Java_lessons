package com.dotinstall.myapp.model;

//抽象クラス -> 具象クラス

public class User implements Printable {
    @Override
    public void print() {
        System.out.println("Now printing user profile...");
    }
}
