import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswortValiTest {


    @Test
    void isValidPasswordLengthTrue() {
        assertEquals(true, PasswortVali.isValidPasswordLength("asssssss"));
    }
    @Test
    void isValidPasswordLengthFalse() {
        assertEquals(false, PasswortVali.isValidPasswordLength("asss"));
    }
    @Test
    void isValidPasswordUpperCaseTrue() {
        assertEquals(true, PasswortVali.isValidPasswordUpperCase("EWEWEWE"));
    }
    @Test
    void isValidPasswordUpperCasefalse() {
        assertEquals(false, PasswortVali.isValidPasswordUpperCase("asss"));
    }
    @Test
    void isValidPasswordLowerCaseTrue() {
        assertEquals(true, PasswortVali.isValidPasswordLowerCase("wwwww"));
    }
    @Test
    void isValidPasswordLowerCaseFalse() {
        assertEquals(false, PasswortVali.isValidPasswordLowerCase("WWWWW"));
    }
    @Test
    void isValidPasswordNumbersTrue() {
        assertEquals(true, PasswortVali.isValidPasswordNumbers("22222"));
    }
    @Test
    void isValidPasswordNumbersfalse() {
        assertEquals(false, PasswortVali.isValidPasswordNumbers("asss"));
    }
    @Test
    void isValidPasswordSpecialCharsTrue() {
        assertEquals(true, PasswortVali.isValidPasswordSpecialChars("#####"));
    }
    @Test
    void isValidPasswordSpecialCharsFalse() {
        assertEquals(false, PasswortVali.isValidPasswordSpecialChars("WWWWW"));
    }
}