import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class EeneyMeeneyMineyMoeTest {

    @org.junit.jupiter.api.Test
    void youreOutTest() {
        Queue<String> test = new LinkedList<>();
        test.add("A");
        test.add("B");
        test.add("C");
        test.add("D");
        test.add("E");

        String expected = "D";
        String actual = EeneyMeeneyMineyMoe.youreOut(test, 3);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void youreOutClassTest () {
        Queue<String> test = new LinkedList<>();
        test.add("GB");
        test.add("Amy");
        test.add("Darcy");
        test.add("Brandon");
        test.add("Ahmed");
        test.add("Molly");
        test.add("Panos");
        test.add("Nick");
        test.add("Tyler");
        test.add("Steve");
        test.add("Sooz");
        test.add("Travis");
        test.add("Paul");
        test.add("Tara");

        String expected = "Ahmed";
        String actual = EeneyMeeneyMineyMoe.youreOut(test, 401);

        assertEquals(expected, actual);
    }
}