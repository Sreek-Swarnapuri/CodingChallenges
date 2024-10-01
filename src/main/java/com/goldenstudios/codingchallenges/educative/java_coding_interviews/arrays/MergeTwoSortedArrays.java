package com.goldenstudios.codingchallenges.educative.java_coding_interviews.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoSortedArrays {

    public static void main(String[] args) {

        System.out.println(method1());

        System.out.println(mergeArrays( new ArrayList<>(Arrays.asList(1,2,3)), new ArrayList<>(Arrays.asList(4,5,6))));
        System.out.println(mergeArrays( new ArrayList<>(Arrays.asList(-1,3)), new ArrayList<>(Arrays.asList(-1,-1,0,0,1,2))));
    }

    public static ArrayList<Integer> mergeArrays(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {

        if(nums1.isEmpty())
            return nums2;
        if(nums2.isEmpty())
            return  nums1;


        ArrayList<Integer> result = new ArrayList<>();

        int p1 = 0;
        int p2 = 0;

        while( p1< nums1.size() && p2< nums2.size()) {
            if(nums1.get(p1) < nums2.get(p2))
                result.add(nums1.get(p1++));
            else if(nums2.get(p2) <  nums1.get(p1))
                result.add(nums2.get(p2++));
            else {
                result.add(nums1.get(p1++));
                result.add(nums2.get(p2++));
            }

        }

        if(p1 < nums1.size())
            result.addAll(nums1.subList(p1,nums1.size()));
        if(p2 < nums2.size())
            result.addAll(nums2.subList(p2,nums2.size()));

        return result;
    }

    public static int method1() {
        int value = 1;
        try{
            throw new ArrayIndexOutOfBoundsException();
        }catch(ArrayIndexOutOfBoundsException e){
            value = 2;
            return value;
        }finally{
            value += 2;
            return value;
        }

    }

}
