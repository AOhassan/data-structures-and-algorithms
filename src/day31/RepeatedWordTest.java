package day31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepeatedWordTest {

    @Test
    void repeatedWordShortTest() {
        String sentence = "Once upon a time, there was a brave princess who";
        String actual = RepeatedWord.repeatedWord(sentence);
        String expected = "a";

        assertEquals(expected, actual);
    }

    @Test
    void repeatedWordMediumTest() {
        String sentence = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, " +
                "and I didn’t know what I was doing in New York";
        String actual = RepeatedWord.repeatedWord(sentence);
        String expected = "summer";

        assertEquals(expected, actual);
    }

    @Test
    void repeatedWordLongTest() {
        String sentence = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the " +
                "age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season " +
                "of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, " +
                "we had everything before us, we had nothing before us, we were all going direct to Heaven, we were " +
                "all going direct the other way – in short, the period was so far like the present period, that some " +
                "of its noisiest authorities insisted on its being received, for good or for evil, in the superlative" +
                " degree of comparison only";
        String actual = RepeatedWord.repeatedWord(sentence);
        String expected = "it";

        assertEquals(expected, actual);
    }
}