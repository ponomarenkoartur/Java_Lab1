package ua.nure.ponomarenko.task1;

import java.util.Arrays;

public class Part4 extends TaskWithNumericInputs {
    final static int NUMBER_OF_ARGUMENTS = 1;

    public static void main(String[] args) {
        setNumberOfArguments(NUMBER_OF_ARGUMENTS);
        setInputString(Arrays.toString(args));
        if (isInputValid(args)) {
            int x = Integer.parseInt(args[0]);
            int result = sumOfAlternatingSeriesOfNumbers(x);
            setOutputString(String.valueOf(result));
        } else {
            setOutputString("Invalid input");
        }
        printReport("Part4: Сумма знакочередующегося ряда факториалов");
    }

    public static int sumOfAlternatingSeriesOfNumbers(int x) {
        int sum = 0;
        int counter = 1;
        int number = 1;
        while (counter <= x) {
            if (counter % 2 == 0) {
                sum -= number;
            } else {
                sum += number;
            }
            counter += 1;
            number *= (counter);
        }
        return sum;
    }
}
