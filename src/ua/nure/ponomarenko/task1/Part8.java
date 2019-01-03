package ua.nure.ponomarenko.task1;

import java.util.Arrays;

public class Part8 extends TaskWithNumericInputs {
    final static int NUMBER_OF_ARGUMENTS = 2;
    private static char letter = 'Ч';

    public static void main(String[] args) {
        setNumberOfArguments(NUMBER_OF_ARGUMENTS);
        setInputString(Arrays.toString(args));
        if (isInputValid(args)) {
            int n = Integer.parseInt(args[0]);
            int m = Integer.parseInt(args[1]);
            char[][] result = chessboard(n, m);

            StringBuilder formatedResult = new StringBuilder();
            formatedResult.append("\n");
            for (char[] line : result) {
                for (char letter : line) {
                    formatedResult.append(letter);
                }
                formatedResult.append("\n");
            }

            setOutputString(formatedResult.toString());
        } else {
            setOutputString("Invalid input");
        }
        printReport("Part8: Шахматная доска размером X на X");
    }

    public static char[][] chessboard(int numberOfLines, int numberOfRows) {
        char[][] chessboard = new char[numberOfLines][numberOfRows];

        for (int x = 0; x < numberOfLines; x++) {
            for (int y = 0; y < numberOfRows; y++) {
                chessboard[x][y] = letter;
                toggleLetter();
            }
            if (chessboard.length % 2 == 0) {
                toggleLetter();
            }
        }
        return chessboard;
    }

    private static void toggleLetter() {
        if (letter == 'Ч') {
            letter = 'Б';
        } else {
            letter = 'Ч';
        }
    }
}
