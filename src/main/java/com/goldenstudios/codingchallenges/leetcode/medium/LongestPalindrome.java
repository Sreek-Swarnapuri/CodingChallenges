package com.goldenstudios.codingchallenges.leetcode.medium;

public class LongestPalindrome {

    public static void main(String[] args) {
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        String test1 = "abb";
//        System.out.println(test1.substring(0,1));
//        System.out.println(test1.substring(0,2));
//        System.out.println(test1.substring(0,3));
//        System.out.println(test1.substring(1,1));
//        System.out.println(test1.substring(1,2));
//        System.out.println(test1.substring(1,3));
//        System.out.println(test1);
//        System.out.println(longestPalindrome.longestPalindrome(test1));
        System.out.println(longestPalindrome.longestPalindrome("zudfweormatjycujjirzjpyrmaxurectxrtqedmmgergwdvjmjtstdhcihacqnothgttgqfywcpgnuvwglvfiuxteopoyizgehkwuvvkqxbnufkcbodlhdmbqyghkojrgokpwdhtdrwmvdegwycecrgjvuexlguayzcammupgeskrvpthrmwqaqsdcgycdupykppiyhwzwcplivjnnvwhqkkxildtyjltklcokcrgqnnwzzeuqioyahqpuskkpbxhvzvqyhlegmoviogzwuiqahiouhnecjwysmtarjjdjqdrkljawzasriouuiqkcwwqsxifbndjmyprdozhwaoibpqrthpcjphgsfbeqrqqoqiqqdicvybzxhklehzzapbvcyleljawowluqgxxwlrymzojshlwkmzwpixgfjljkmwdtjeabgyrpbqyyykmoaqdambpkyyvukalbrzoyoufjqeftniddsfqnilxlplselqatdgjziphvrbokofvuerpsvqmzakbyzxtxvyanvjpfyvyiivqusfrsufjanmfibgrkwtiuoykiavpbqeyfsuteuxxjiyxvlvgmehycdvxdorpepmsinvmyzeqeiikajopqedyopirmhymozernxzaueljjrhcsofwyddkpnvcvzixdjknikyhzmstvbducjcoyoeoaqruuewclzqqqxzpgykrkygxnmlsrjudoaejxkipkgmcoqtxhelvsizgdwdyjwuumazxfstoaxeqqxoqezakdqjwpkrbldpcbbxexquqrznavcrprnydufsidakvrpuzgfisdxreldbqfizngtrilnbqboxwmwienlkmmiuifrvytukcqcpeqdwwucymgvyrektsnfijdcdoawbcwkkjkqwzffnuqituihjaklvthulmcjrhqcyzvekzqlxgddjoir"));


//        System.out.println(longestPalindrome.isPalindrome("bab"));
//        System.out.println(longestPalindrome.isPalindrome("aba"));
//        System.out.println(longestPalindrome.isPalindrome("vannav"));
//        System.out.println(longestPalindrome.isPalindrome("Sreekar"));
//        System.out.println(longestPalindrome.isPalindrome("Pandu"));
    }

    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        for(int i= (s.length()-1); i >= 0; i--) {
            sb.append(s.charAt(i));
        }

        return s.contentEquals(sb);
    }

    public String longestPalindrome(String s) {

        // loop through each character in the String

        // for each character, loop through the rest of the chracters and find if each substring is a palindrome
        // if the string is palindrome, record the length and updat the max length if its more than the previous one

        if(isPalindrome(s))
            return s;

        int maxLen = 0;
        String finalString = "";

        for(int i = 0; i < s.length() ; i++) {

            for(int j = i; j< s.length(); j++) {
                if(isPalindrome(s.substring(i,j+1))) {
                    if((j-i+1)>maxLen) {
                        finalString = s.substring(i,j+1);
                        maxLen = Math.max(maxLen, (j-i) + 1);
                    }
                }
            }

        }
        return finalString;

    }

}
