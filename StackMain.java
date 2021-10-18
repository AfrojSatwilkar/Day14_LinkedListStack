package com.company1.LinkedListStack;

public class StackMain {
    public static void main(String[] args) {
        //deleting element from queue
        System.out.println("Deleting element from queue ::");
        Stack stack = new Stack();
        stack.addNode(56);
        stack.addNode(30);
        stack.addNode(70);
        stack.printList();
        stack.deleteHead();
        stack.printList();
    }
}
