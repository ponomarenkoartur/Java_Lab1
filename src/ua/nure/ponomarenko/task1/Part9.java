package ua.nure.ponomarenko.task1;

import java.util.Arrays;

public class Part9 extends Task {
    final static int NUMBER_OF_ARGUMENTS = 0;

    public static void main(String[] args) {
        setNumberOfArguments(NUMBER_OF_ARGUMENTS);
        setInputString(Arrays.toString(args));
        if (isInputValid(args)) {
            int[][][][][] result = fiveDimensionalArray();
            setOutputString(Arrays.deepToString(result));
        } else {
            setOutputString("Invalid input");
        }
        printReport("Part9: Пятимерный массив заполненый числами");
    }

    public static int[][][][][] fiveDimensionalArray() {
        int[][][][][] array = new int[2][2][2][2][2];

        for (int i = 0; i < 32; i++) {
            int i1 = i / 16;
            int i2 = (i / 8) % 8 % 4 % 2;
            int i3 = (i / 4) % 4 % 2;
            int i4 = (i / 2) % 2;
            int i5 = i % 2;
            array[i1][i2][i3][i4][i5] = i + 1;
        }

        return array;
    }
}
