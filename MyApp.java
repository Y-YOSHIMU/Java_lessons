public class MyApp {

    public static void main(String[] args) {
        // switch
        // 信号機
        String signal = "green";
        switch (signal) {
            case "red":
                System.out.println("Stop!");
                break;
            case "blue":
            case "green":
                System.out.println("Go!");
                break;
            case "yellow":
                System.out.println("Caution!");
                break;
            default:
                System.out.println("Wrong signal...");
                break;
        }
    }
}