package ua.nure.ponomarenko.task1;

import java.util.Arrays;

public class Part6 extends TaskWithNumericInputs {
    final static int NUMBER_OF_ARGUMENTS = 1;


    public static void main(String[] args) {
        setNumberOfArguments(NUMBER_OF_ARGUMENTS);
        setInputString(Arrays.toString(args));
        if (isInputValid(args)) {
            int x = Integer.parseInt(args[0]);
            int[] result = firstNumbersOfFibonachi(x);
            setOutputString(Arrays.toString(result));
        } else {
            setOutputString("Invalid input");
        }
        printReport("Part6: X чисел Фибоначчи");
    }

    public static int[] firstNumbersOfFibonachi(int count) {
        int[] numbersOfFibonachi = new int[count];
        int a = 1;
        int b = 1;
        numbersOfFibonachi[0] = a;

        for (int i = 1; i < count; i++) {
            numbersOfFibonachi[i] = b;
            int temp = b;
            b = a + b;
            a = temp;
        }
        return numbersOfFibonachi;
    }

    public static boolean isInputValid(String args[]) {
        try {
            int x = Integer.parseInt(args[0]);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
