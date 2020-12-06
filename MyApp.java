public class MyApp {

    public static void main(String[] args) {
        // int x = 10;
        // int y = x;
        // y = 5;
        //     System.out.println(x);
        //     System.out.println(y);

        // int[] a = {3, 5, 7};
        // int[] b = a; // 同じデータを参照している
        // b[1] = 8; // よってa[1]と同じデータなのでaの値も変わる
        // System.out.println(a[1]);
        // System.out.println(b[1]);

        String s = "hello";
        String t = s;
        t = "world";
        System.out.println(s);
        System.out.println(t);

    }
}