package udemy.zerotoherods;

public class MergeTwoSortedArrays {

    public static void main(String[] args) {

        int[] arr1 = new int[]{0,3,4,31};

        int[] arr2 = new int[]{4,6,30};

        // new way

        // looping through the shortest array and then
        // loop through the second array until i find a number larger than 4 or number at position i and I am also recording the position in the second array as j
        // next go to i++ but in the second loop I would start at j and then do the same as above of finding a larger number than the number at position i in the first array

        // i - 0 -- 4
        // finding number larger than 4 would give me 31 and the position of j would be 3 until here, I would have pushed 0,3 & 4 to new array
        // j - 3
        // i - 1 -- 6
        // finding number larger than 6 is obviously 31 so 6 is pushed to new array but j stays at 31
        // i - 2 -- 30
        // finding number larger than 30 is obviously 31, so 30 is pushed to the new array
        // if i+1 == size of the mainArray, I would push the rest of the second array data from j position until its end to the end of the array.



        int[] shortArr;
        int[] longArr;

        if(arr1.length > arr2.length) {
            shortArr = arr2;
            longArr = arr1;
        }
        else {
            shortArr = arr1;
            longArr = arr2;
        }

        int newArr[] = new int[shortArr.length + longArr.length];

        int j = 0;
        int k = 0;

        for (int i = 0; i < shortArr.length; i++) {
            while(true) {
                if(shortArr[i]<longArr[j]) {
                    newArr[k] = shortArr[i];
                    break;
                }
                else {
                    newArr[k] = longArr[j];
                    k++;
                    j++;
                }
            }
        }

        // new array - 0 3 4 6 30

        // old way
        // i from 0 to size of the largest array

        // i is at 0 compare and put the lowest element of the two in both arrays to the new array, then push the largest of the two to the new array

        // i is at 1 - get the lowest element of the two arrays and compare it with the i the element of the new array

        // 0 2 4 5 7

        // 1 2 3 5 6 8 9

    }

}
