import static org.junit.jupiter.api.Assertions.*;

class D01_ArrayReverseTest {

    @org.junit.jupiter.api.Test
    void arrayReverse1() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] expected = {6,5,4,3,2,1};

        D01_ArrayReverse.arrayReverse(arr);
        assertArrayEquals(expected, arr);
    }

    @org.junit.jupiter.api.Test
    void arrayReverse2() {
        assertEquals(true, true);
    }
}
