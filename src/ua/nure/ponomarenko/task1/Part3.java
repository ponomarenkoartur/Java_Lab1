package ua.nure.ponomarenko.task1;

import java.util.Arrays;

public class Part3 extends TaskWithNumericInputs {
    final static int NUMBER_OF_ARGUMENTS = 1;

    public static void main(String[] args) {
        setNumberOfArguments(NUMBER_OF_ARGUMENTS);
        setInputString(Arrays.toString(args));
        if (isInputValid(args)) {
            int x = Integer.parseInt(args[0]);
            boolean result = isPrime(x);
            setOutputString(String.valueOf(result));
        } else {
            setOutputString("Invalid input");
        }
        printReport("Part3: Являеться ли простым числом");
    }


    public static boolean isPrime2(int number) {
        if (number == 1 || number == 0 || number % 2 == 0)
            return false;

        boolean isPrime = true;
        for (int i = 3; i < Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static boolean isPrime(int x) {
        boolean isPrime = true;
        if (x == 1 || x == 0)
            isPrime = false;
        else if (x == 2)
            isPrime = true;
        else if (x % 2 == 0)
            isPrime = false;
        else {
            int i = 3;
            while (i * i <= x) {
                if (x % i == 0) {
                    isPrime = false;
                    return isPrime;
                }
                i += 2;
            }
        }
        return isPrime;
    }
}
