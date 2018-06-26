package com.array.common;/*

Longest substring non repeating characters

Sample Input
"abcddedfkj"
"aaa"
""
"abcademnnehew"
"abcddeffj"

*/

import java.util.HashSet;
import java.util.Set;

class SolutionSubStringNonRepeatingChars {
    public static void main(String[] args) {
        String input = "abcademnnehew";
        int highestResult = -1;
        int currentResult = lengthNonRepeatingChars(input, highestResult);

        System.out.println(currentResult);
    }

    private static int lengthNonRepeatingChars(String input, int highestResult) {
        Set<Character> currentResultSet = new HashSet<>();

        if (input != null) {
            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                if (!currentResultSet.contains(currentChar)) {
                    currentResultSet.add(currentChar);
                } else {
                    if (currentResultSet.size() > highestResult) {
                        highestResult = currentResultSet.size();
                    }
                    currentResultSet = new HashSet<>();
                }

                //get highest result of sub string
                int nestedResult = lengthNonRepeatingChars(input.substring(i + 1), highestResult);
                if (nestedResult > highestResult) {
                    highestResult = nestedResult;
                }
            }
        }

        return highestResult;
    }
}