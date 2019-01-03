package ua.nure.ponomarenko.task1;

import java.util.Arrays;

public class Part12 extends Task {
    final static int NUMBER_OF_ARGUMENTS = -1;

    public static void main(String[] args) {
        setNumberOfArguments(NUMBER_OF_ARGUMENTS);
        String result = concatanationOfLatinCharacters(args);
        setInputString(Arrays.toString(args));
        setOutputString(result);
        printReport("Part12: Конкатанация всех латинских символов");
    }

    public static String concatanationOfLatinCharacters(String[] strings) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : strings) {
            for (char character : string.toCharArray()) {
                if ((character > 64 && character < 91) ||
                        (character > 96 && character < 123)) {
                    stringBuilder.append(character);
                }
            }
        }
        return stringBuilder.toString();
    }
}
