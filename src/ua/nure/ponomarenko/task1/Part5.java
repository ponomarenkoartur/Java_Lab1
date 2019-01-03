package ua.nure.ponomarenko.task1;

import java.util.Arrays;

import static java.lang.Math.pow;

public class Part5 extends TaskWithNumericInputs {
    final static int NUMBER_OF_ARGUMENTS = 1;

    public static void main(String[] args) {
        setNumberOfArguments(NUMBER_OF_ARGUMENTS);
        setInputString(Arrays.toString(args));
        if (isInputValid(args)) {
            int n = Integer.parseInt(args[0]);
            int result = numberOfLuckyNumbers(n);
            setOutputString(String.valueOf(result));
        } else {
            setOutputString("Invalid input");
        }
        printReport("Part5: Количество счастливых чисел с N количеством цифер");
    }

    public static int numberOfLuckyNumbers(int numberOfDigitsInNumber) {
        if (numberOfDigitsInNumber % 2 != 0) {
            return 0;
        }
        int lowerBound = (int) pow(10.0, (double) (numberOfDigitsInNumber - 1));
        int higherBound = (int) pow(10.0, (double) numberOfDigitsInNumber);
        int sum = 0;
        for (int number = lowerBound; number < higherBound; number++) {
            int[] halfsOfNumber = splitNumber(number, numberOfDigitsInNumber);
            // If left half of number equals to right half of number
            // then is lucky
            if (halfsOfNumber[0] == halfsOfNumber[1]) {
                sum++;
            }

        }
        return sum;
    }

    public static int[] splitNumber(int number, int numberOfDigitsInNumber) {
        int rightNumberSection = number % (int) pow(10, numberOfDigitsInNumber / 2);
        int leftNumberSection = number / (int) pow(10, numberOfDigitsInNumber / 2);
        return new int[]{leftNumberSection, rightNumberSection};
    }
}
