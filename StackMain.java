package com.company1.LinkedListStack;

public class StackMain {
    public static void main(String[] args) {
        //inserting element to queue
        System.out.println("Inserting element into queue ::");
        Stack stack = new Stack();
        stack.addNode(56);
        stack.addNode(30);
        stack.addNode(70);
        stack.printList();
    }
}
