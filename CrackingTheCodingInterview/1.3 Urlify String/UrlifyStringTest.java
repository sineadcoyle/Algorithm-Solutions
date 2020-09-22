package codinginterview.algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class UrlifyStringTest {

    @Test
    void testUrlfied() {
        assertEquals("sinead%20coyle", UrlifyString.urlify("sinead coyle"));
    }

    @Test
    void testUrlfiedNoSpace() {
        assertEquals("sinead", UrlifyString.urlify("sinead"));
    }

    @Test
    void testUrlfiedSpaceAtEnd() {
        assertEquals("sinead", UrlifyString.urlify("sinead    "));
    }

    @Test
    void testEmptyString() {
        assertEquals("", UrlifyString.urlify(""));
    }

    @Test
    void testNull() {
        assertEquals("", UrlifyString.urlify(null));
    }

}