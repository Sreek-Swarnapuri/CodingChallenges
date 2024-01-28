package com.goldenstudios.codingchallenges.datastructures;

/**
 * Implementing an Array in Java
 */
public class MyArray<T> {

    private Integer length;

    private T data[];

    MyArray() {
        this.length = 0;
        this.data = (T[]) new Object[10];
    }

}
