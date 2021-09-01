package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;

        for (int row = 0; row < array.length; row += 1) {
            for (int cell = 0; cell < array[row].length; cell += 1) {
                rsl += array[row][cell];
            }
        }
        return rsl;
    }
}