package practice.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsUniqueTest {

    @Test
    void isUnique() {
        String sentence = "hey guys how are you doing";

        boolean actual = IsUnique.isUnique(sentence);
        boolean expected = false;

        assertEquals(expected, actual);
    }
}