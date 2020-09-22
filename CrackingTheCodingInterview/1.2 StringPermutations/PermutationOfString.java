package codinginterview.algorithms;

import java.util.Arrays;

public class PermutationOfString {

    static boolean isPermutation(String original, String toTest) {
        if (original == null || toTest == null) return false;
        // if case doesn't matter, use these lines
        original = original.toLowerCase();
        toTest = toTest.toLowerCase();

        // check simple conditions early
        if (original.equals(toTest)) return true;
        if (original.length() != toTest.length()) return false;

        char[] sortedOriginal = original.toCharArray();
        Arrays.sort(sortedOriginal);
        char[] sortedToTest = toTest.toCharArray();
        Arrays.sort(sortedToTest);

        return sortedOriginal.equals(sortedToTest);
    }

    public static void main(String[] args) {
        System.out.println("Is permutation: " + isPermutation("sinead", "sinead"));
    }

}
