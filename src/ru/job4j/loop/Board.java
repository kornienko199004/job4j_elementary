package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        for (int y = 0; y < height; y += 1) {
            for (int x = 0; x < width; x += 1) {
                /* условие проверки, что писать пробел или X */
                /* Выше в задании мы определили закономерность, когда нужно проста,влять X */
                if ((x + y) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            /* добавляем перевод на новую строку. */
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}
