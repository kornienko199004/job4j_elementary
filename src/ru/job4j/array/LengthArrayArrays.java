package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int[] number : numbers) {
            System.out.println(
                    "Размер вложенного массива равен: " + number.length
            );
        }
        int[][] numbers2 = {{1}, {1, 2}, {1, 2, 3}, {1, 2, 3, 4}};
        for (int[] ints : numbers2) {
            System.out.println(
                    "Размер вложенного массива равен: " + ints.length
            );
        }
    }
}
