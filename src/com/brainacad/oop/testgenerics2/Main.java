package com.brainacad.oop.testgenerics2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arrayOne = new Integer[10];
        Double[] arrayTwo = new Double[10];

        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = (int) (Math.random()*100);
        }
        for (int j = 0; j < arrayTwo.length; j++) {
            arrayTwo[j] = (Math.random()*100);
        }

        int valOne = 20;
        double valTwo = 35.5;

        System.out.println("Array values: "+Arrays.toString(arrayOne));
        System.out.println("Number of elements that are greater than "+ valOne+ " :");
        System.out.println(MyTestMethod.calcNum(arrayOne, valOne));

        System.out.println("Array values: "+Arrays.toString(arrayTwo));
        System.out.println("Number of elements that are greater than "+ valTwo+ " :");
        System.out.println(MyTestMethod.calcNum(arrayTwo, valTwo));
    }
}
