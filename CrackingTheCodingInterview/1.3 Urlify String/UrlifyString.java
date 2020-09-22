package codinginterview.algorithms;

/**
 * Urlify using StringBuilder
 * CTCI book says that we can't use strings directly because it would create
 * a new copy of the string each time, but StringBuilder doesn't
 * I leave out the second parameter of string length here as a result
 */

public class UrlifyString {

    static String urlify(String s) {
        if (s == null) return "";

        s = s.trim();

        char[] stringToChars = s.toCharArray();
        char space = ' ';

        StringBuilder urlified = new StringBuilder();
        for (int i = 0; i < stringToChars.length; i++) {
            String toAdd = String.valueOf(stringToChars[i]);
            if (stringToChars[i] == (space)) {
                toAdd = "%20";

            }
            urlified.append(toAdd);
        }

        return urlified.toString();
    }

    public static void main(String[] args) {
        System.out.println("URL: " + urlify("sinead coyle "));
    }

}
