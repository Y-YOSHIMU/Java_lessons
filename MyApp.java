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

class AdminUser extends User {

    AdminUser(String name) {
        super(name);
    }

    void sayHello() {
        System.out.println("hello! " + this.name);
    }

    // override 親メソッドの上書き
    @Override // 明示的に書くことでmethodのタイポなどでエラーが出る
    void sayHi() {
        System.out.println("[admin] hi! " + this.name);
    }
}

public class MyApp {

    public static void main(String[] args) {
        User tom = new User("Tom");
        System.out.println(tom.name);
        tom.sayHi();

        AdminUser bob = new AdminUser("Bob");
        System.out.println(bob.name);
        bob.sayHi();
        bob.sayHello();
    }
}