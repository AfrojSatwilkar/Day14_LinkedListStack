package com.company1.LinkedListStack;

public class StackMain {
    public static void main(String[] args) {
        //deleting stack head element
        System.out.println("deleting element ::");
        Stack stack = new Stack();
        stack.addNode(70);
        stack.addNode(30);
        stack.addNode(56);
        stack.printList();
        stack.peek();
        stack.deleteHead();
        stack.printList();
        stack.peek();
        stack.deleteHead();
        stack.printList();
        stack.peek();
        stack.deleteHead();
    }
}
