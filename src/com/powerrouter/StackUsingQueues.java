package com.powerrouter;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
    private Queue<Integer> primaryQueue = new LinkedList<>();
    private Queue<Integer> auxiliaryQueue = new LinkedList<>();

    // Push operation
    public void push(int value) {
        // Move all elements from primaryQueue to auxiliaryQueue
        while (!primaryQueue.isEmpty()) {
            auxiliaryQueue.add(primaryQueue.poll());
        }

        // Add the new value to the empty primaryQueue
        primaryQueue.add(value);

        // Move elements back to primaryQueue from auxiliaryQueue
        while (!auxiliaryQueue.isEmpty()) {
            primaryQueue.add(auxiliaryQueue.poll());
        }

        System.out.println("Push: " + value);
    }

    // Pop operation
    public int pop() {
        if (primaryQueue.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int poppedElement = primaryQueue.poll();
        System.out.println("Pop: " + poppedElement);
        return poppedElement;
    }

    // Top operation
    public int top() {
        if (primaryQueue.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int topElement = primaryQueue.peek();
        System.out.println("Top: " + topElement);
        return topElement;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return primaryQueue.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Display the top element
        stack.top();

        // Pop elements from the stack
        stack.pop();
        stack.pop();

        // Check if the stack is empty
        System.out.println("Is the stack empty? " + stack.isEmpty());
    }
}




/* This Java program provides a stack-like behavior using two queues. 
 * The push operation adds an element to the stack, the pop operation removes the top element, and the top operation retrieves the top element without removing it. 
 * Each operation is accompanied by a descriptive print statement indicating the action and the value involved. 
 * The main method demonstrates the usage of the stack by performing these operations and checking if the stack is empty.

*/

