package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] matrix = new int[size][size];

        for (int row = 0; row < size; row += 1) {
            for (int cell = 0; cell < size; cell += 1) {
                matrix[row][cell] = (row + 1) * (cell + 1);
            }
        }
        return  matrix;
    }
}
