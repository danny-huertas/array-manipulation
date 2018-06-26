package com.array.common;/*

Imagine we have an image. We’ll represent this image as a simple 2D array where every pixel is a 1 or a 0. The image you get is known to have a single rectangle of 0s on a background of 1s. 

Write a function that takes in the image and returns the coordinates of the rectangle of 0’s -- either top-left and bottom-right; or top-left, width, and height.

Sample output:
x: 3, y: 2, width: 3, height: 2
2,3 3,5
3,2 5,3 -- it’s ok to reverse columns/rows as long as you’re consistent


int[][] image = {
  {1, 1, 1, 1, 1, 1, 1},
  {1, 1, 1, 1, 1, 1, 1},
  {1, 1, 1, 0, 0, 0, 1},
  {1, 1, 1, 0, 0, 0, 1},
  {1, 1, 1, 1, 1, 1, 1}
};


x: 3, y: 2, width: 3, height: 2

*/

class Solution2DArrayImage {
    public static void main(String[] args) {
        int x = -1;
        int y = -1;
        boolean widthSet = false;
        boolean rowHasZero;
        int width = 0;
        int height = 0;

        int[][] image = {
                {1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 0, 0, 0, 1},
                {1, 1, 1, 0, 0, 0, 1},
                {1, 1, 1, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1},
        };

        //System.out.println(image.length);
        for (int i = 0; i < image.length; i++) {
            rowHasZero = false;
            // System.out.println(image[i].length);
            for (int j = 0; j < image[i].length; j++) {
                if (image[i][j] == 0) {

                    if (x == -1) {
                        x = j;
                    }
                    if (y == -1) {
                        y = i;
                    }
                    if (!widthSet) {
                        width++;
                    }

                    rowHasZero = true;
                }
            }

            if (rowHasZero) {
                height++;
            }

            //System.out.println(height);
            if (width > 0) {
                widthSet = true;
            }
        }

        printResults(x, y, width, height);
    }

    private static void printResults(int x, int y, int width, int height) {
        System.out.println("x: " + x + " y: " + y + " width: " + width + " height: " + height);
    }
}