package ua.nure.ponomarenko.task1;

import java.util.Arrays;

public class Part2 extends TaskWithNumericInputs {

    final static int NUMBER_OF_ARGUMENTS = 1;

    public static void main(String[] args) {
        setNumberOfArguments(NUMBER_OF_ARGUMENTS);
        setInputString(Arrays.toString(args));
        if (isInputValid(args)) {
            int x = Integer.parseInt(args[0]);
            int result = sumOfDigits(x);
            setOutputString(String.valueOf(result));
        } else {
            setOutputString("Invalid input");
        }
        printReport("Part2: Сумма цифр числа");
    }

    public static int sumOfDigits(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
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
