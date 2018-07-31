package day11;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class QueueWithStacksTest {

    @org.junit.jupiter.api.Test
    void enqueueEmptyTest() {
        QueueWithStacks test = new QueueWithStacks();
        test.enqueue(5);

        int actual = test.s1.pop();
        int expected  = 5;

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void enqueueShortTest() {
        QueueWithStacks actual = new QueueWithStacks();
        actual.enqueue(6);
        actual.enqueue(5);


        QueueWithStacks expected = new QueueWithStacks();
        expected.s1.push(6);
        expected.s1.push(5);

        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @org.junit.jupiter.api.Test
    void enqueueLongTest() {
        QueueWithStacks actual = new QueueWithStacks();
        actual.enqueue(6);
        actual.enqueue(5);
        actual.enqueue(3);
        actual.enqueue(1);


        QueueWithStacks expected = new QueueWithStacks();
        expected.s1.push(6);
        expected.s1.push(5);
        expected.s1.push(3);
        expected.s1.push(1);

        assertArrayEquals(expected.toArray(), actual.toArray());
    }


    @org.junit.jupiter.api.Test
    void dequeueShortTest() {
        QueueWithStacks test = new QueueWithStacks();
        test.s1.push(6);

        int actual = test.dequeue();
        int expected = 6;

        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void dequeueMidTest() {
        QueueWithStacks test = new QueueWithStacks();
        test.s1.push(3);
        test.s1.push(5);

        int actual = test.dequeue();
        int expected = 3;

        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void dequeueLongTest() {
        QueueWithStacks test = new QueueWithStacks();
        test.s1.push(1);
        test.s1.push(5);
        test.s1.push(7);
        test.s1.push(2);
        int actual = test.dequeue();
        int expected = 1;

        assertEquals(expected,actual);
    }
}