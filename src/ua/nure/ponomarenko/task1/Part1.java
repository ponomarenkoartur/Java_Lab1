package ua.nure.ponomarenko.task1;


import java.util.ArrayList;
import java.util.Arrays;

public class Part1 extends TaskWithNumericInputs {

    final static int NUMBER_OF_ARGUMENTS = 2;

    public static void main(String args[]) {
        setNumberOfArguments(NUMBER_OF_ARGUMENTS);
        setInputString(Arrays.toString(args));
        if (isInputValid(args)) {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            int result = greatestCommonDivider(x, y);
            setOutputString(String.valueOf(result));
        } else {
            setOutputString("Invalid input");
        }
        printReport("Part1: Наибольший общий делитель");
    }

    private static int greatestCommonDivider(int x, int y) {
        int greatestCommonDivider = 1;
        ArrayList<Integer> commonFactors = commonFactors(x, y);
        for(int factor: commonFactors) {
            greatestCommonDivider *= factor;
        }
        return greatestCommonDivider;
    }

    private static ArrayList<Integer> commonFactors(int x, int y) {
        ArrayList<Integer> commonFactors = new ArrayList<Integer>();
        ArrayList<Integer> xFactors = factorize(x);
        ArrayList<Integer> yFactors = factorize(y);

        for(int i = 0; i < xFactors.size(); i++) {
            Integer xFactor = xFactors.get(i);
            for(int j = 0; j < yFactors.size(); j++) {
                Integer yFactor = yFactors.get(j);
                if (xFactor == yFactor) {
                    commonFactors.add(xFactor);
                    xFactors.remove(i);
                    yFactors.remove(j);
                    i--;
                    j--;
                    break;
                }
            }
        }
        return commonFactors;
    }

    private static ArrayList<Integer> factorize(int number) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        while (number != 1) {
            int factor = minimumDividerDifferentFromOne(number);
            factors.add(factor);
            number /= factor;
        }
        return factors;
    }

    private static int minimumDividerDifferentFromOne(int number) {
        int divider = 2;
        while (number % divider != 0) {
            divider += 1;
        }
        return divider;
    }
}
