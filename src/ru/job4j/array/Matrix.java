package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] matrix = new int[size][size];

        for (int row = 0; row < matrix.length; row += 1) {
            for (int cell = 0; cell < matrix[row].length; cell += 1) {
                matrix[row][cell] = (row + 1) * (cell + 1);
            }
        }
        return  matrix;
    }
}
