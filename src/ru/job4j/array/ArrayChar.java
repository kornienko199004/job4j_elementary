package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        for (int i = 0; i < pref.length; i += 1) {
            if (word[i] != pref[i]) {
                return  false;
            }
        }
        return true;
    }
}