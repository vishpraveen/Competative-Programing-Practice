package stack;

import java.util.Scanner;

public class StackUsingArray {
    int size = 5;
    int[] arr = new int[size];
    int pointer = -1;

    private boolean isEmpty() {
        return pointer == -1;
    }

    private boolean isFull() {
        return pointer == size - 1;
    }

    private void push(int value) {
        if (!isFull()) {
            pointer++;
            arr[pointer] = value;
        } else {
            System.out.println("Stack is full.");
        }
        printOperations();
    }

    private void pop() {
        if (!isEmpty()) {
            System.out.println("Removed: " + arr[pointer]);
            pointer--;
        } else System.out.println("Stack is Empty");
        printOperations();
    }

    private int peek() {
        if (!isEmpty()) return arr[pointer];
        else return -1;
    }

    private void printOperations() {
        System.out.println("Select below operations: ");
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Peek");
        Scanner sc = new Scanner(System.in);
        int action = sc.nextInt();
        switch (action) {
            case 1: {
                System.out.println("Enter value:");
                int value = sc.nextInt();
                push(value);
            }
            case 2:
                pop();
            case 3: {
                System.out.println("Peek value: " + peek());
                printOperations();
            }
            default: {
                sc.close();
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray();
        stack.printOperations();
    }
}
