package com.ecommerce.dsa.stack;


public class Stack {
    private int[] arr;
    private int top;
    private int capacity;

    //creating stack
    Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    //push elements to the top of the stack
    public void push(int x) {
        if(top == capacity-1) {
            System.out.println("stack overflow");
        } else {
            arr[++top] =x;
            //size = size+1;
            //arr[size] = x;
        }
    }

    public int pop() {
        if(top == -1) {
            System.out.println("stack underflow");
            return -1;
        } else {
            int x = arr[top--] ;
            //top = top-1;
            return x;
            //return arr[top--];
        }
    }

    // return size of the stack
    public int getSize() {
        return top + 1;
    }

    // check if the stack is empty
    public Boolean isEmpty() {
        return top == -1;
    }

    // check if the stack is full
    public Boolean isFull() {
        return top == capacity - 1;
    }

    // display elements of stack
    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.print("Stack: ");
        stack.printStack();
        System.out.println("isFull" + stack.isFull());

        // remove element from stack
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("isEmpty" + stack.isEmpty());
        System.out.println("\nAfter popping out");
        stack.printStack();


    }
}
