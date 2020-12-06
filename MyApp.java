public class MyApp {

    public static void main(String[] args) {
        // 配列
        // sales1, sales2, ....
        // sales

        // int[] sales;
        // sales = new int[3];
        // sales[0] = 100;
        // sales[1] = 200;
        // sales[2] = 300;

        // int[] sales;
        // sales = new int[] {100, 200, 300};

        int[] sales = {100, 200, 300};

        System.out.println(sales[1]); // 200

        // 再代入
        sales[1] = 1000;
        System.out.println(sales[1]); // 1000
    }
}