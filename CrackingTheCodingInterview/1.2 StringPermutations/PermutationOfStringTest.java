package codinginterview.algorithms;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PermutationOfStringTest {

    @Test
    void testIsPermutation() {
        assertTrue(PermutationOfString.isPermutation("sinead", "sinead"));
    }

    @Test
    void testIsNotPermutation() {
        PermutationOfString.isPermutation("sinead", "bob");
    }

    @Test
    void testIsNotPermutationEqualNumOfChars() {
        PermutationOfString.isPermutation("sinead", "bobber");
    }

    @Test
    void testEmptyString() {
        assertFalse(PermutationOfString.isPermutation("sinead", ""));
    }

    @Test
    void testNull() {
        assertFalse(PermutationOfString.isPermutation("sinead", null));
    }

}