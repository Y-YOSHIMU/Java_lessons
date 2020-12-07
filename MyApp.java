class User {
    String name = "Me!"; // フィールド classに属する変数

    void sayHi() {
        System.out.println("hi!");
    }
}

public class MyApp {

    public static void main(String[] args) {
        // Class
        User tom;
        tom = new User(); // インスタンス
        System.out.println(tom.name);
        tom.sayHi();
    }
}