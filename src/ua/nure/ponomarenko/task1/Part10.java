package ua.nure.ponomarenko.task1;

import java.util.ArrayList;
import java.util.Arrays;

public class Part10 extends TaskWithNumericInputs {
    final static int NUMBER_OF_ARGUMENTS = 1;

    public static void main(String[] args) {
        setNumberOfArguments(NUMBER_OF_ARGUMENTS);
        setInputString(Arrays.toString(args));
        if (isInputValid(args)) {
            int x = Integer.parseInt(args[0]);
            ArrayList<ArrayList<Integer>> result = pascalTriangle(x);

            StringBuilder formatedResult = new StringBuilder();
            formatedResult.append('\n');
            for (ArrayList<Integer> line : result) {
                for (int number : line) {
                    formatedResult.append(number + " ");
                }
                formatedResult.append('\n');
            }
            setOutputString(formatedResult.toString());
        } else {
            setOutputString("Invalid input");
        }
        printReport("Part10: Треугольник Паскаля высотой X");
    }

    public static ArrayList<ArrayList<Integer>> pascalTriangle(int count) {
        ArrayList<ArrayList<Integer>> pascalTriangle = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < count; i++) {
            ArrayList<Integer> line = new ArrayList<Integer>();
            for (int j = 0; j < i + 1; j++) {
                line.add(binomialCoefficient(i, j));
            }
            pascalTriangle.add(line);
        }
        return pascalTriangle;
    }

    public static int binomialCoefficient(int n, int m) {
        return (int) (factorial(n) / (factorial(m) * factorial(n - m)));
    }

    public static long factorial(int number) {
        if (number == 0) {
            return 1;
        }
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
