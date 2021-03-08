import java.util.*;

public class AreaCalculator {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Shape Area Calculator");

        while(true) {

            System.out.println();
            System.out.println("-=-=-=-=-=-=-=-=-=-");
            System.out.println("1) Triangle");
            System.out.println("2) Rectangle");
            System.out.println("3) Circle");
            System.out.println("4) Quit");
            System.out.println();

            System.out.println("Which shape: ");

            int shape = keyboard.nextInt();
            System.out.println();

            if (shape == 1) {
                area_triangle(5,6);
            } else if (shape == 2) {
                area_rectangle(4,5);
            } else if (shape == 3) {
                area_circle(4);
            } else if (shape == 4) {
                    quit();
                    break;
            }
        }
    }

    public static double area_triangle(int base, int height) {
        
    }
}