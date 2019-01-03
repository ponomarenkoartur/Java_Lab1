package ua.nure.ponomarenko.task1;

abstract public class Task {

    private static String inputString;
    private static String outputString;

    // If class can perform actions on any number of arguments
    // then 'numberOfArguments' should be -1
    private static int numberOfArguments = 0;

    public static void printReport(String taskText) {
        System.out.println(taskText + ":\n" +
                "Input: " + inputString + "\n" +
                "Output: " + outputString);
    }

    public static boolean isInputValid(String[] args) {
        if (numberOfArguments == -1) {
            return true;
        }
        return args.length == numberOfArguments;
    }

    // Getters and setters
    public static String getOutputString() {
        return outputString;
    }

    public static void setOutputString(String outputString) {
        Task.outputString = outputString;
    }

    public static String getInputString() {
        return inputString;
    }

    public static void setInputString(String input) {
        Task.inputString = input;
    }

    public static int getNumberOfArguments() {
        return numberOfArguments;
    }

    public static void setNumberOfArguments(int numberOfArguments) {
        Task.numberOfArguments = numberOfArguments;
    }
}
