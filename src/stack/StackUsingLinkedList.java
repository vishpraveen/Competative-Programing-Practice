package stack;

import java.util.Scanner;

public class StackUsingLinkedList {

    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            next = null;
        }
    }

    ListNode list = null;

    private boolean isEmpty() {
        return list == null;
    }

    private void push(int value) {
        ListNode temp = new ListNode(value);
        temp.next = list;
        list = temp;
        printOperations();
    }

    private void pop() {
        if(isEmpty()) System.out.println("Stack is Empty");
        else {
            System.out.println("Removed: "+list.val);
            list = list.next;
            System.gc();
        }
        printOperations();
    }

    private int peek() {
        if (isEmpty()) return -1;
        else return list.val;
    }

    private void printList() {
        if (isEmpty()) System.out.println("Stack is empty");
        else {
            ListNode node = list;
            while(node != null) {
                System.out.print(node.val + " ->");
                node = node.next;
            }
        }
        printOperations();
    }
    private void printOperations() {
        System.out.println("\nSelect below operations: ");
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Peek");
        System.out.println("4. Print List");
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
            case 4: {
                System.out.println("Printing Stack");
                printList();
                printOperations();
            }
            default: {
                sc.close();
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.printOperations();
    }
}
