package com.goldenstudios.codingchallenges.datastructures;

public class SinglyLinkedListWithTail<T> {

    private int size;
    private Node head;
    private Node tail;

    public SinglyLinkedListWithTail() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // isEmpty
    public boolean isEmpty() {
        return this.head == null && this.tail == null;
    }

    // insertions

    // insert at head
    // insert at tail
    // insert at middle

    public void insertAtHead(T data) {
        Node dataNode = new Node(data);

        dataNode.nextNode = head;
        head = dataNode;
        if(tail == null)
            tail = dataNode;
        size++;
    }

    public void insertAtTail(T data) {

        if(isEmpty()) {
            insertAtHead(data);
        }

        Node dataNode = new Node(data);

        tail.nextNode = dataNode;
        tail = dataNode;
        size++;
        
    }

    public boolean insert(T data, T prev) {
        Node prevNode = search(prev);

        if(prevNode == null)
            return false;

        Node newNode = new Node(data);

        newNode.nextNode = prevNode.nextNode;
        prevNode.nextNode = newNode;
        if(tail == prevNode)
            tail = newNode;
        size++;

        return  true;
    }

//    public boolean insertAtPosition(T data, int position) {
//        if(isEmpty())
//            return false;
//
//        if(position == 0 || size == (position+1))
//
//        return  true;
//    }

    //public boolean insertAfterPosition(T data, )

    // deletions

    // delete at head

    // delete at tail

    // delete by value

    // delete by position


    // Search

    // Search by Value
    public Node search(T data) {
        Node currNode = head;
        while(currNode != null) {
            if(currNode.data == data)
                return currNode;
            currNode = currNode.nextNode;
        }
        return null;
    }

//    // Search by position
//    public Node search(int position) {
//        Node currNode = head;
//        int count = 0;
//
//    }


    class Node {
        T data;
        Node nextNode;

        Node(T data) {
            this.data = data;
        }
    }



}
