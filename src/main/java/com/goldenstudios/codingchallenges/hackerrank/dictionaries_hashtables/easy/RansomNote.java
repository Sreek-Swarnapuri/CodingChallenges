package com.goldenstudios.codingchallenges.hackerrank.dictionaries_hashtables.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Hacker rank: https://www.hackerrank.com/challenges/ctci-ransom-note/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
public class RansomNote {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }

    private static void checkMagazine(String[] magazine, String[] note) {

        //Space complexity - O(magazine.size)
        Map<String, Integer> magazineWordCount = new HashMap<>();

        //Time complexity - O(magazine.size)
        for (String word:
             magazine) {
            if(magazineWordCount.containsKey(word))
                magazineWordCount.put(word,magazineWordCount.get(word)+1);
            else
                magazineWordCount.put(word,1);
        }

        //Time complexity - O(note.size)
        for (String word:
             note) {
            if(magazineWordCount.containsKey(word)) {
                if(magazineWordCount.get(word)==1)
                    magazineWordCount.remove(word);
                else
                    magazineWordCount.put(word,magazineWordCount.get(word)-1);
            }
            else {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");

        //Total time complexity: O(magazine.size + note.size)
    }

}
