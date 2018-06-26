package com.array.common;

public class Test {

    public static void main(String[] args) {
        String str = "aabbccdd";
        str = str.toUpperCase();
        System.out.println(str);
        //BBCC
        str = str.substring(2, 6);
        System.out.println(str);
        MarineShip submarine = new Submarine();
        ((Submarine) submarine).go();
    }
}
