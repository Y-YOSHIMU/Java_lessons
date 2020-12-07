class User {
    String name; // フィールド classに属する変数

    // constructor
    User(String name) {
        this.name = name;
    }

    User() {
        // this.name = "Me!";
        this("Me!");
    }

    void sayHi() {
        System.out.println("hi! " + this.name);
    }
}

public class MyApp {

    public static void main(String[] args) {
        // Class
        User tom;
        // tom = new User("Tom"); // インスタンス
        tom = new User();
        System.out.println(tom.name);
        tom.sayHi();
    }
}