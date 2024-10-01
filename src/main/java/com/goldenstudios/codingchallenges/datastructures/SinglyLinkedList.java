package com.goldenstudios.codingchallenges.datastructures;

public class SinglyLinkedList<T> {

    class Node {
        T data;
        Node nextElement;
    }

    public Node headNode;

    public int size;

    public SinglyLinkedList() {
        headNode = null;
        size = 0;
    }

    public boolean isEmpty() {
        return headNode == null;
    }

    public void insertAtHead(T data) {
        // create new node with the data to insert
        Node newNode = new Node();
        newNode.data = data;

        // set the head node to the next of new node
        newNode.nextElement = headNode;
        // reset head node to the new node
        headNode = newNode;
        this.size++;
    }

    public void insertAtEnd(T data) {

        // if list is empty, use insertAtHead method
        if(isEmpty()) {
            insertAtHead(data);
            return;
        }

        // create a new node with the data to insert
        Node newNode = new Node();
        newNode.data = data;

        // navigate to the last element in the linked list
        Node currNode = headNode;

        while(currNode.nextElement != null) {
            currNode = currNode.nextElement;
        }

        // set the last element's next to the new node
        currNode.nextElement = newNode;
        this.size++;
    }
    public boolean insertAfter(T data, T previous) {

        Node currentNode = headNode;

        while(currentNode != null && currentNode.data != previous)
            currentNode = currentNode.nextElement;

        if(currentNode == null)
            return false;
        else {
            Node newNode = new Node();
            newNode.data = data;

            newNode.nextElement = currentNode.nextElement;
            currentNode.nextElement = newNode;
            return true;
        }

    }

    public void deleteHead() {

        if(headNode == null)
            return;

        headNode = headNode.nextElement;
        this.size--;
    }

    public void deleteTail() {}

    public void deleteAtPosition() {}

    public void deleteByValue(T data) {}



    public void printList() {
        Node currNode = headNode;
        while(currNode!= null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.nextElement;
        }

        System.out.print(currNode);
        System.out.println();
    }

    public static void main(String[] args) {

        SinglyLinkedList<Integer> integerSinglyLinkedList = new SinglyLinkedList<>();

        System.out.println("Is linked list empty? " + integerSinglyLinkedList.isEmpty());

        integerSinglyLinkedList.insertAtHead(3);
        integerSinglyLinkedList.printList();
        integerSinglyLinkedList.insertAtHead(2);
        integerSinglyLinkedList.printList();
        integerSinglyLinkedList.insertAtHead(1);
        integerSinglyLinkedList.printList();

        integerSinglyLinkedList.insertAtEnd(4);
        integerSinglyLinkedList.printList();
        integerSinglyLinkedList.insertAtEnd(5);
        integerSinglyLinkedList.printList();

        System.out.println("inserting 7 after 5 ? " + integerSinglyLinkedList.insertAfter(7, 5));
        integerSinglyLinkedList.printList();
        System.out.println("inserting 6 after 5 ? " + integerSinglyLinkedList.insertAfter(6, 5));

        System.out.println("Is linked list empty? " + integerSinglyLinkedList.isEmpty());

        integerSinglyLinkedList.printList();

    }

}
