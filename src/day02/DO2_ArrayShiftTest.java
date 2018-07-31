package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DO2_ArrayShiftTest {

    @Test
    void insertShiftArray() {

        int[] arr = {2, 4, 6, 8};
        int[] expected = {2, 4, 5, 6, 8};

        D02_ArrayShift.insertShiftArray(arr, 5);
        assertArrayEquals(expected, arr);
    }

}


