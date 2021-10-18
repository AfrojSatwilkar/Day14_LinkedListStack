package com.company1.LinkedListStack;

public class Stack {
    MyNode head;

    //add element
    public void addNode(int data) {
        MyNode node = new MyNode(data);
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
        printList();
    }

    //print stack
    public void printList() {
        MyNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("");
    }
}
