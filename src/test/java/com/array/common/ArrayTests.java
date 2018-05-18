package com.array.common;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayTests {

    @Test
    public void arrayReverseSortTestOne() {
        int[] inputArray = { 11, 1, 0, 3, 4 };
        int[] expectedOutputArray = { 4, 3, 1, 1, 1, 0 };
        int[] outputArray = reverseOrderArraySort(inputArray);

        // writing the line out just incase you want to see the output
        System.out.println(Arrays.toString(outputArray));

        //assert that the output array equals the expected output array
        Assert.assertArrayEquals(outputArray, expectedOutputArray);
    }

    @Test
    public void arrayReverseSortTestTwo() {
        int[] inputArray = { 7, 2, 3, 4 };
        int[] expectedOutputArray = { 7, 4, 3, 2 };
        int[] outputArray = reverseOrderArraySort(inputArray);

        // writing the line out just incase you want to see the output
        System.out.println(Arrays.toString(outputArray));

        //assert that the output array equals the expected output array
        Assert.assertArrayEquals(outputArray, expectedOutputArray);
    }

    /**
     * Builds an int array in reverse order by using each character in an incoming int array
     *
     * @param inputArray int array
     * @return int array in reverse order by char
     */
    private int[] reverseOrderArraySort(int[] inputArray) {
        return Arrays
                .stream(IntStream.of(inputArray).mapToObj(Integer::toString).collect(Collectors.joining("")).chars()
                        .map(x -> x - '0').toArray()).boxed().
                        sorted(Comparator.reverseOrder()).
                        mapToInt(i -> i).
                        toArray();
    }
}
