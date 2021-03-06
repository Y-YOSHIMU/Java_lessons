public class Debug {

    public static void main(String[] args) {

        int width = 0;
        int length = 40;

        try {
            int ratio = length / width;
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }

        // int ratio = length / width;
        // System.out.println(ratio);
        // Exception in thread "main" java.lang.ArithmeticException: / by zero


        // System.out.println("       1");
        // System.out.println("     2 3");
        // System.out.println("   4 5 6");
        // System.out.println("7 8 9 10")
        // // Debug.java:8: error: ';' expected
        // //     System.out.println("7 8 9 10")
        // //                                   ^
        // //    1 error
    }
}