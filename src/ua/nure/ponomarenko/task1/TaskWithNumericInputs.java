package ua.nure.ponomarenko.task1;

abstract public class TaskWithNumericInputs extends Task {

    public static boolean isInputValid(String[] args) {
        if (!Task.isInputValid(args)) {
            return false;
        }
        try {
            for (String i : args) {
                int x = Integer.parseInt(i);
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
