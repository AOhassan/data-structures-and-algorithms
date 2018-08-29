package day36;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    void mergeSortLongTest() {
        int[] arr = {8,5,3,4,2,7,1,6};
        int[] actual = MergeSort.mergeSort(arr);
        int[] expected = {1,2,3,4,5,6,7,8};

        assertArrayEquals(expected, actual);
    }
    @Test
    void mergeSortMediumTest() {
        int[] arr = {8,5,3,4};
        int[] actual = MergeSort.mergeSort(arr);
        int[] expected = {3,4,5,8};

        assertArrayEquals(expected, actual);
    }
    @Test
    void mergeSortShortTest() {
        int[] arr = {8,5};
        int[] actual = MergeSort.mergeSort(arr);
        int[] expected = {5,8};

        assertArrayEquals(expected, actual);
    }
}