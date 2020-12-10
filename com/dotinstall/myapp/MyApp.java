package com.dotinstall.myapp;
import com.dotinstall.myapp.model.User;
import com.dotinstall.myapp.model.AdminUser;
import com.dotinstall.myapp.model.AmericanUser;
import com.dotinstall.myapp.model.JapaneseUser;

// 例外

class MyException extends Exception {
    public MyException(String s) {
        super(s);
    }
}

public class MyApp {

    public static void div(int a, int b) {
        try {
            if (b < 0) {
                throw new MyException("not minus!");
            }
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        } catch (MyException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println(" -- end -- ");
        }
    }

    public static void main(String[] args) {
        div(3, 0);
        div(5, -2);
    }
}