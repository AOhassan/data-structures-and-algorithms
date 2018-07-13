package day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransposeMatrixTest {

    @Test
    void transposeMatrix() {
        int[][] aa = {{1, 2, 3,},
                {3, 2, 1,},
                {4, 5, 6}};

        int[][] expected = {{1, 3, 4,},
                {2, 2, 5,},
                {2, 1, 6}};

        int[][] actual = TransposeMatrix.transposeMatrix(aa);
        assertArrayEquals(expected, actual);

    }
}