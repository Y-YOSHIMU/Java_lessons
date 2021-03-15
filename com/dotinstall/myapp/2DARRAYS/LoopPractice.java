public class LoopPractice {
    public static void main(String[] args) {
        String[][] wordData = {{"study", "consider", "examine", "learn"}, {"ponder", "read", "think", "cogigate"}};

        int characterCount = 0;
        for (String[] wordRow : wordData) {
            for (String word : wordRow) {
                characterCount += word.length();
            }
        }

        System.out.println(characterCount);

        int row = 0, column = 0;
        while (row < wordData.length) {
            column = 0;
            while (column < wordData[row].length) {
                System.out.println(wordData[row][column] + ": [" + row + "]" + "[" + column + "]");
                column++;
            }
            row++;
        }
    }
}