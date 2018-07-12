package day03;

import day03.BinarySearch;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @org.junit.jupiter.api.Test
    void binarySearchTest() {

        int num = 15;
        int[] arr = {4, 8, 15, 16, 23, 42};

        int expected = 2;
        int actual = BinarySearch.binarySearch(arr, num);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void binarySearchTest1() {

        int num = 90;
        int[] arr = {11, 22, 33, 44, 55, 66, 77};

        int expected = -1;
        int actual = BinarySearch.binarySearch(arr, num);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void binarySearchTest3() {

        int num = 1;
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        int expected = 0;
        int actual = BinarySearch.binarySearch(arr, num);
        assertEquals(expected, actual);
    }
}