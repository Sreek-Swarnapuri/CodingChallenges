package com.goldenstudios.codingchallenges.datastructures;

import java.util.ArrayList;
import java.util.List;

public class ArrayListUsage {

    public static void main(String[] args) {
        List<Integer> numsList = new ArrayList<>();
        System.out.println("initial size: " + numsList.size());
        numsList.add(1);
        System.out.println("new size: " + numsList.size());

    }

}
