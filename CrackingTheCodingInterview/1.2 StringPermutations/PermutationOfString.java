package codinginterview.algorithms;

import java.util.HashMap;
import java.util.Map;

public class PermutationOfString {

    static boolean isPermutation(String original, String toTest) {
        if (original == null || toTest == null) return false;
        // if case doesn't matter, use these lines
        original = original.toLowerCase();
        toTest = toTest.toLowerCase();

        if (original.equals(toTest)) return true;
        if (original.length() != toTest.length()) return false;

        Map<Character, Integer> originalCharsToFrequencies = getCharsToFrequencyMap(original);
        Map<Character, Integer> toTestCharsToFrequencies = getCharsToFrequencyMap(toTest);

        return originalCharsToFrequencies.equals(toTestCharsToFrequencies);
    }

    static Map<Character, Integer> getCharsToFrequencyMap(String s) {
        Map<Character, Integer> charsToFrequencies = new HashMap<>();

        for (Character c : s.toCharArray()) {
            Integer frequency = charsToFrequencies.get(c);
            if (frequency != null) {
                frequency++;
                charsToFrequencies.put(c, frequency);
            }
            else {
                charsToFrequencies.put(c, 1);
            }
        }

        return charsToFrequencies;
    }

    public static void main(String[] args) {
        System.out.println("Is permutation: " + isPermutation("sinead", "sinead"));
    }

}
