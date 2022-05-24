package queue;

import linked_list.ListNode;

import java.util.Scanner;

public class QueueUsingLinkedList {
    ListNode front = null, rear = null;

    private boolean isEmpty() {
        return (front == null && rear == null);
    }

    private void enqueue(int value) {
        ListNode temp = new ListNode(value);
        if (isEmpty()) {
            front = rear = temp;
        } else {
            rear.next = temp;
            rear = rear.next;
        }
        printOperations();
    }

    private void dequeue() {
        if (front == null && rear == null) System.out.println("Queue is empty.");
        else {
            if (front.next == null) {
                front = rear = null;
            } else {
                front = front.next;
            }
        }
        printOperations();
    }

    private void peek() {
        if (isEmpty()) System.out.println("Queue is empty.");
        else System.out.println("Peek: " + front.val);
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
        QueueUsingLinkedList queue = new QueueUsingLinkedList();
        queue.printOperations();
    }
}
