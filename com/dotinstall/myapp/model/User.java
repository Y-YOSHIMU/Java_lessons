package com.dotinstall.myapp.model;

public class User {
    private String name;
    private int score;

    public User(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int getScore() { // getter
        return this.score;
    }

    public void setScore(int score) { // setter
        if (score > 0) {
            this.score = score;
        }
    }

    public void sayHi() {
        System.out.println("hi! " + this.name);
    }
}
