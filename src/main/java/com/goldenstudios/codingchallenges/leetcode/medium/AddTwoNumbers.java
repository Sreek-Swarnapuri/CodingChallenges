package com.goldenstudios.codingchallenges.leetcode.medium;

public class AddTwoNumbers {

    public static void main(String[] args) {

        long num = 10000000000L;

        int[] arr = new int[] {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};

        System.out.println((int)num%10);
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("Maximum value of long: " + maxLongValue);
        System.out.println("length of max of long: " + String.valueOf(maxLongValue).length());
        System.out.println("given arr len: " + arr.length);

        AddTwoNumbers atn = new AddTwoNumbers();

        ListNode l1 = new ListNode(9);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);
        l2.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next.next.next = new ListNode(9);

        System.out.println(atn.getNumber(l1));
        System.out.println(atn.getNumber(l2));
        System.out.println(atn.getNumber(l1) + atn.getNumber(l2));

        System.out.println(atn.getNumber(atn.addTwoNumbers(l1,l2)));

    }

    ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        long firstNum = getNumber(l1);
        long secondNum = getNumber(l2);

        long sumOfNums = firstNum + secondNum;

        // 80
        long temp = sumOfNums/10;
        long rem = sumOfNums%10;
        ListNode firstNode = new ListNode((int)rem);

        ListNode tempNode = firstNode;

        while(temp>0) {
            long nextDigit = temp%10;
            ListNode l = new ListNode((int)nextDigit);
            tempNode.next = l;
            tempNode = l;
            temp /= 10;
        }

        return firstNode;

    }

    public ListNode addTwoNumbersSingleLoop(ListNode l1, ListNode l2) {
        int sum = l1.val + l2.val;

        int carry = sum/10;

        ListNode firstNode = new ListNode(sum % 10);

        ListNode tempNode = firstNode;

        l1 = l1.next;
        l2 = l2.next;

        while(l1 != null || l2 != null || carry != 0 ) {
            int l1Val = (l1 != null)? l1.val : 0;
            int l2Val = (l2 != null)? l2.val : 0;
            int nextVal = l1Val + l2Val + carry;
            tempNode.next = new ListNode( nextVal % 10);
            tempNode = tempNode.next;
            carry = nextVal / 10;
            l1 = (l1 != null)? l1.next : null;
            l2 = (l2 != null)? l2.next : null;
        }

        return firstNode;
    }

    public long getNumber(ListNode ln) {
        long result = 0;
        long multiplier = 1;
        while(ln != null) {
            result += (ln.val * multiplier);
            multiplier *= 10;
            ln = ln.next;
        }
        return result;
    }

}

class ListNode {
    int val;

    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}