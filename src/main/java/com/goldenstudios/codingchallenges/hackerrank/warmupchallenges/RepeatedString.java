package com.goldenstudios.codingchallenges.hackerrank.warmupchallenges;

import java.util.Scanner;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {


        long aInString = 0 ;
        long stringLength = s.length();

        for(int i =0; i< stringLength ; i++){
            if(s.charAt(i) == 'a')
                aInString++;
        }

        long aOccInStringRepetetion = (n/stringLength) * aInString;

        long remLengthOfString = n%stringLength ;

        aInString = 0;
        for(int i =0; i< remLengthOfString ; i++){
            if(s.charAt(i) == 'a')
                aInString++;
        }

        return (aOccInStringRepetetion + aInString);



    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)  {


        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        System.out.println(result);

        scanner.close();
    }

}
