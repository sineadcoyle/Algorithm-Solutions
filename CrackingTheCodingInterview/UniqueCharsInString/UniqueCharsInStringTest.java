package com.codinginterview.algorithms;

import codinginterview.algorithms.UniqueCharsInString;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class UniqueCharsInStringTest {

    @Test
    void testHasUniqueChars() {
        assertEquals(true, UniqueCharsInString.hasUniqueCharsInString("sinead"));
    }

    @Test
    void testNoUniqueChars() {
        assertEquals(false, UniqueCharsInString.hasUniqueCharsInString("bob"));
    }

    @Test
    void testEmptyString() {
        assertEquals(false, UniqueCharsInString.hasUniqueCharsInString(""));
    }

    @Test
    void testNull() {
        assertEquals(false, UniqueCharsInString.hasUniqueCharsInString(null));
    }

}