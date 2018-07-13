package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class D04_ArrayAdjacentProductTest {

    @Test
    void largestProductTest1() {
        int[][] aa =   {{1,2,1},
                        {2,4,2},
                        {3,6,8},
                        {7,8,1}};
        int expected = 64;

        int actual = D04_ArrayAdjacentProduct.largestProduct(aa);
        assertEquals(expected, actual);

    }


    @Test
    void largestProductTest2() {
        int[][] aa = {{1,2,3},
                      {3,3,2},
                      {3,5,8},
                      {6,4,9}};
        int expected = 72;

        int actual = D04_ArrayAdjacentProduct.largestProduct(aa);
        assertEquals(expected, actual);

    }


    @Test
    void largestProductTest3() {
        int[][] aa =   {{3,7,5},
                        {8,1,2},
                        {9,10,4},
                        {7,0,3}};
        int expected = 90;

        int actual = D04_ArrayAdjacentProduct.largestProduct(aa);
        assertEquals(expected, actual);

    }
}