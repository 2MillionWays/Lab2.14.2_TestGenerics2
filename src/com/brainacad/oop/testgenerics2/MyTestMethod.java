package com.brainacad.oop.testgenerics2;


public class MyTestMethod {
    public static<T extends Comparable<T>> int calcNum(T[] array, T maxelem){
        int count = 0;
        for (T element : array){
            if(element.compareTo(maxelem)>0){
                ++count;
            }
        }
        return count;
    }
}
