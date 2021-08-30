package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean standard = data[0];

        for (int i = 1; i < data.length; i += 1) {
            if (data[i] != standard) {
                return false;
            }
        }
        return true;
    }
}