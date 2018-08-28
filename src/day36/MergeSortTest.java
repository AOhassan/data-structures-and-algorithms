package day36;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    void mergeSortTest() {
        int[] arr = {8,5,3,4,2,7,1,6};
        int[] actual = MergeSort.mergeSort(arr, 0, arr.length - 1);
        int[] expected = {1,2,3,4,5,6,7,8};

        assertArrayEquals(expected, actual);
    }
}