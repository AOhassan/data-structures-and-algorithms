package practice.p1;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void rotLeftShortTest() {

        int[] arr = {1,2,3,4,5};
        int[] actual = {3,4,5,1,2};
        int[] expected = Solution.rotLeft(arr, 2);

        assertArrayEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void rotLeftLongTest() {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] actual = {6,7,8,9,10,1,2,3,4,5};
        int[] expected = Solution.rotLeft(arr, 5);

        assertArrayEquals(expected, actual);
    }
}