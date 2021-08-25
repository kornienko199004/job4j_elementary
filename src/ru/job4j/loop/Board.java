package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        for (int y = 0; y < height; y += 1) {
            for (int x = 0; x < width; x += 1) {
                if ((x + y) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}
