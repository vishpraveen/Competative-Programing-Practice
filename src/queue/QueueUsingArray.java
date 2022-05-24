package queue;

import java.util.Scanner;

public class QueueUsingArray {

    int MAX_SIZE = 4;
    int front = -1, rear = -1;
    int[] queue = new int[MAX_SIZE];

    private boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    private boolean isFull() {
        return rear == MAX_SIZE - 1;
    }

    private void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (isEmpty()) {
                front++;
            }
            rear++;
            queue[rear] = value;
        }
        printOperations();
    }

    private void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
        }
        printOperations();
    }

    private void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Peek: " + queue[front]);
        }
    }

    private void printOperations() {
        System.out.println("Select below operations: ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Peek");
        Scanner sc = new Scanner(System.in);
        int action = sc.nextInt();
        switch (action) {
            case 1: {
                System.out.println("Enter value:");
                int value = sc.nextInt();
                enqueue(value);
            }
            case 2:
                dequeue();
            case 3: {
                peek();
                printOperations();
            }
            default: {
                sc.close();
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray();
        queue.printOperations();
    }
}
