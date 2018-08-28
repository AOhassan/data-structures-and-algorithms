package practice.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeAnagramTest {

    @Test
    void makeAnagram() {
        int expected = 30;
        int actual = MakeAnagram.makeAnagram("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke");
        assertEquals(expected, actual);
    }
}