package com.goldenstudios.codingchallenges.udemy_dsa_course_andre;

public class Sorting {

    public static void main(String[] args) {
        int[] sortedArray = mergeSort(new int[]{1, 2, 5, 3, 4});

        printArray(sortedArray);

        sortedArray = mergeSort(new int[]{5, 4, 3, 2, 1});

        printArray(sortedArray);
        sortedArray = mergeSort(new int[]{1, 234, 56, 23, 345, 65, 864, 3423, 23, 42, 237, 65, 6, 4, 3, 23, 4, 6, 7, 8, 75, 765465, 64, 66, 43});

        printArray(sortedArray);
        sortedArray = mergeSort(new int[]{-1, -2, -3, -4, -5, -6, -7, 6, 43, 7, 2, 4, 0});

        printArray(sortedArray);

        int[] arrayForQuickSort = new int[]{-1, -2, -3, -4, -5, -6, -7, 6, 43, 7, 2, 4, 0};
        printArray(arrayForQuickSort);
        sortedArray = quickSort(arrayForQuickSort, 0 , arrayForQuickSort.length - 1);

        printArray(sortedArray);
    }

    private static void printArray(int[] sortedArray) {
        for (int j : sortedArray) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static int[] mergeSort(int[] array) {
        if (array.length == 1)
            return array;

        int middle = array.length / 2;

        int[] left = new int[middle];
        int[] right = new int[array.length - middle];

        for (int i = 0; i < array.length; i++) {
            if (i < middle)
                left[i] = array[i];
            else
                right[i - middle] = array[i];
        }

        return merge(mergeSort(left), mergeSort(right));
    }

    static int[] merge(int[] left, int[] right) {
        int lp = 0;
        int rp = 0;

        int[] sortedArray = new int[left.length + right.length];
        int sortedArrayCounter = 0;
        // 1 2 5   3 4
        while (lp < left.length || rp < right.length || sortedArrayCounter < sortedArray.length) {
            if ((lp < left.length && rp < right.length && left[lp] < right[rp]) || rp == right.length) {
                sortedArray[sortedArrayCounter++] = left[lp++];
            } else {
                sortedArray[sortedArrayCounter++] = right[rp++];
            }
        }

        return sortedArray;
    }


    //QUICK SORT ---------------------------------------------------------------------------------------------------

    static int[] quickSort(int[] array, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(array, left, right);

            quickSort(array, left, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, right);
        }
        return array;
    }


    // 3 4 9 6 8 5 7
    static int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int partitionIndex = left;

        for (int i = left; i < right; i++) {
            if (array[i] < pivot) {
                swap(array, i, partitionIndex++);
            }
        }
        swap(array, partitionIndex, right);
        return partitionIndex;
    }

    static void swap(int[] array, int leftIndex, int rightIndex) {
        int temp = array[leftIndex];
        array[leftIndex] = array[rightIndex];
        array[rightIndex] = temp;
    }


}
