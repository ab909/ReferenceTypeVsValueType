package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 10;
        int anotherIntValue = myIntValue;
        System.out.println(myIntValue);
        System.out.println(anotherIntValue);

        anotherIntValue++;

        System.out.println(myIntValue);
        System.out.println(anotherIntValue);

        int [] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("MyIntArray " + Arrays.toString(myIntArray));
        System.out.println("AnotherArray " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("after change MyIntArray " + Arrays.toString(myIntArray));
        System.out.println("after change AnotherArray " + Arrays.toString(anotherArray));

        anotherArray = new int [] {1, 2, 3, 4, 5};
        modifyArray(myIntArray);

        System.out.println("after modified MyIntArray " + Arrays.toString(myIntArray));
        System.out.println("after modified AnotherArray " + Arrays.toString(anotherArray));

    }
    private static void modifyArray(int[] array){
        array[0] = 2;
        array = new int [] {1, 2, 3, 4, 5};
    }
}
