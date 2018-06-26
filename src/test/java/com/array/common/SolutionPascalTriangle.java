package com.array.common;/*

Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it.

Input: 5
Output:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]

*/

import java.util.ArrayList;
import java.util.List;

class SolutionPascalTriangle {
    private static final int BORDER = 1;

    public static void main(String[] args) {
        List<List<Integer>> pascalTriangle = generatePascalTriangle(5);

        System.out.println(pascalTriangle.toString());
    }

    private static List<List<Integer>> generatePascalTriangle(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> prev;
        List<Integer> current = new ArrayList<>();

        if (numRows < 0) {
            return result;
        }

        current.add(BORDER);
        prev = current;
        result.add(current);

        for (int i = 0; i < numRows - 1; i++) {
            current = new ArrayList<>();

            current.add(BORDER);
            for (int j = 0; j < i; j++) {
                current.add(prev.get(j) + prev.get(j + 1));
            }
            current.add(BORDER);
            prev = current;
            result.add(current);
        }

        return result;
    }
}