package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int row = 0; row < array.length; row += 1) {
            for (int cell = 0; cell < array[row].length; cell += 1) {
                if (array[row][cell] < 0) {
                    array[row][cell] = 0;
                }
            }
        }
        return array;
    }
}