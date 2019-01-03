package ua.nure.ponomarenko.task1;

import java.util.ArrayList;
import java.util.Arrays;

public class Part7 extends TaskWithNumericInputs {
    final static int NUMBER_OF_ARGUMENTS = 1;

    public static void main(String[] args) {
        setNumberOfArguments(NUMBER_OF_ARGUMENTS);
        setInputString(Arrays.toString(args));
        if (isInputValid(args)) {
            int x = Integer.parseInt(args[0]);
            ArrayList<Integer> result = firstPrimeNumbers(x);
            setOutputString(Arrays.toString(result.toArray()));
        } else {
            setOutputString("Invalid input");
        }
        printReport("Part7: Первые N простых чисел");
    }

    public static ArrayList<Integer> firstPrimeNumbers(int count) {
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
        int number = 0;
        while (primeNumbers.size() < count) {
            if (Part3.isPrime(number)) {
                primeNumbers.add(number);
            }
            number++;
        }
        return primeNumbers;
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
