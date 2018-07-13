package day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class FibonacciTest {

    @Test
    void FibonacciTest(){


        int expected = 4;
        int actual = Fibonacci.fib(3);

        assertEquals(expected, actual);


    }
}