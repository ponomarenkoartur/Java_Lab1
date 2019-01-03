package ua.nure.ponomarenko.task1;

import java.util.Arrays;

public class Part11 extends Task {
    final static int NUMBER_OF_ARGUMENTS = -1;

    public static void main(String[] args) {
        setNumberOfArguments(NUMBER_OF_ARGUMENTS);
        int result = sumOfDigitsInString(args);
        setInputString(Arrays.toString(args));
        setOutputString(String.valueOf(result));
        printReport("Part11: Сумма цифр в строке");
    }

    public static int sumOfDigitsInString(String[] strings) {
        int sum = 0;
        for (String string : strings) {
            for (char character : string.toCharArray()) {
                Integer x = tryParseInt(character);
                if (x != null) {
                    sum += x;
                }
            }
        }
        return sum;
    }

    private static Integer tryParseInt(char value) {
        String stringValue = value + "";
        Integer x;
        try {
            x = Integer.parseInt(stringValue);
        } catch (NumberFormatException e) {
            x = null;
        }
        return x;
    }
}
