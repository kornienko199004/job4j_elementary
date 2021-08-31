package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i += 1) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length - 1);
            swap(data, index, i);
        }
        return data;
    }

    public  static void swap(int[] data, int src, int dest) {
        int temp = data[src];
        data[src] = data[dest];
        data[dest] = temp;
    }
}