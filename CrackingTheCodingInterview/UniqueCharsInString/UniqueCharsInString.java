package codinginterview.algorithms;

import java.util.LinkedList;

public class UniqueCharsInString {

    public static boolean hasUniqueCharsInString(String s) {
        if (s == null || s.isEmpty()) return false;

        boolean hasUniqueChars = true;
        LinkedList<Character> charsFound = new LinkedList<>();
        for (Character c : s.toCharArray()) {
            if (charsFound.contains(c)) {
                hasUniqueChars = false;
                break;
            }
            else {
                charsFound.add(c);
            }
        }
        return hasUniqueChars;
    }

    public static void main(String[] args) {
        System.out.println("Has unique chars: " + hasUniqueCharsInString("sinead"));
    }
}
