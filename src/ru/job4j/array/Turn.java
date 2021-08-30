package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int middle = array.length / 2;
        int end = array.length - 1;
        int temp;

        for (int i = 0; i < middle; i += 1) {
            temp = array[i];
            array[i] = array[end - i];
            array[end - i] = temp;
        }
        return array;
    }
}