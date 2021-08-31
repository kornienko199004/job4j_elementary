package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index += 1) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public static int indexOf(int[] data, int el, int start, int finish) {
        for (int index = start; index <= finish; index += 1) {
            if (data[index] == el) {
                return index;
            }
        }
        return -1;
    }
}
