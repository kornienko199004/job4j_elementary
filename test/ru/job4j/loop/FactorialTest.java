package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        /* напишите здесь тест, проверяющий, что факториал для числа 5 равен 120. */
        int value = 5;
        int result = Factorial.calc(value);
        int expect = 120;

        Assert.assertEquals(result, expect);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        /* напишите здесь тест, проверяющий, что факториал для числа 0 равен 1. */
        int value = 0;
        int result = Factorial.calc(value);
        int expect = 1;

        Assert.assertEquals(result, expect);
    }
}