public class Exercise3 {
    public static void main(String[] args) {
        int[][] intMatrix = {
            {1, 1, 1, 1, 1},
            {2, 4, 6, 8, 0},
            {9, 8, 7, 6, 5}
        };

        int retrievedInt = intMatrix[0][3];
        System.out.println(retrievedInt);

        System.out.println(intMatrix[1][2] * 3);
    }
}