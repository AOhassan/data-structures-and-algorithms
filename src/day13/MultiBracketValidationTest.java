//package day13;
//
//import org.junit.jupiter.api.Test;
//
//import static day13.MultiBracketValidation.multiBracketValidation;
//import static org.junit.jupiter.api.Assertions.*;
//
//class MultiBracketValidationTest {
//
//    @Test
//    void multiBracketValidationTest1() {
//
//        boolean expected = true;
//        boolean actual = multiBracketValidation("(){}[[]]");
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void multiBracketValidationTest2() {
//        MultiBracketValidation test = new MultiBracketValidation();
//
//        boolean expected = true;
//        boolean actual = multiBracketValidation("{}{Code}[Fellows](())");
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void multiBracketValidationTest3() {
//        MultiBracketValidation test = new MultiBracketValidation();
//
//        boolean expected = false;
//        boolean actual = multiBracketValidation("[({}]");
//        assertEquals(expected, actual);
//    }
//
//}
