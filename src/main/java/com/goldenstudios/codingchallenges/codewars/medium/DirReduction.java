package com.goldenstudios.codingchallenges.codewars.medium;

import java.util.ArrayList;
import java.util.Arrays;

public class DirReduction {

    static final String NORTH = "north";
    static final String SOUTH = "south";
    static final String EAST = "east";
    static final String WEST = "west";

    public static String[] dirRedux(String[] arr){

        ArrayList<String> remArray = new ArrayList<String>();

        for (String ar:
             arr) {

            //If the remembering array is empty, add the current element of the input array
            if ( !remArray.isEmpty() && cancelOut(remArray.get(remArray.size() - 1),ar))
                remArray.remove(remArray.size()-1);
            else
                remArray.add(ar);
        }


        return remArray.toArray(new String[remArray.size()]);
    }

    public static boolean cancelOut(String left, String right){
        if(
                ( left.equalsIgnoreCase(NORTH) && right.equalsIgnoreCase(SOUTH) )
                || left.equalsIgnoreCase(SOUTH) && right.equalsIgnoreCase(NORTH)
        )
            return true;
        else if(
                ( left.equalsIgnoreCase(WEST) && right.equalsIgnoreCase(EAST) )
                        || left.equalsIgnoreCase(EAST) && right.equalsIgnoreCase(WEST)
        )
            return true;

        return false;
    }

    public static void main(String[] args){

        //System.out.println(Arrays.toString(dirRedux(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"})));

        System.out.println(Arrays.toString(dirRedux(new String[]{"EAST", "EAST", "WEST", "NORTH", "WEST", "EAST", "EAST", "SOUTH", "NORTH", "WEST"})));

    }

}
