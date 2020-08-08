package codinginterview.algorithms;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class UniqueCharsInStringTest {

    @Test
    void testHasUniqueChars() {
        assertTrue(UniqueCharsInString.hasUniqueCharsInString("sinead"));
    }

    @Test
    void testNoUniqueChars() {
        assertFalse(UniqueCharsInString.hasUniqueCharsInString("bob"));
    }

    @Test
    void testEmptyString() {
        assertFalse(UniqueCharsInString.hasUniqueCharsInString(""));
    }

    @Test
    void testNull() {
        assertFalse(UniqueCharsInString.hasUniqueCharsInString(null));
    }

}