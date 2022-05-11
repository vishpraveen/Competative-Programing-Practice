package linked_list;

import java.util.Scanner;

public class DynamicLinkedList {
    ListNode head;
    
    private void printCommands() {
        System.out.println("Select From below commands:");
        System.out.println("1. Insert at start.");
        System.out.println("2. Insert at End.");
        System.out.println("3. Delete at start.");
        System.out.println("4. Delete at end.");

        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        switch(value) {
            case 1: 
                int data = sc.nextInt();
                insertNodeAtStart(data);
            break; 
            case 2: 
            int data1 = sc.nextInt();
                insertNodeAtEnd(data1);
            break;
            case 3: 
                deleteAtStart();
            break;
            case 4: 
                deleteAtEnd();
            break;
            default:
                // printCommands();
                System.exit(0);
            break;
        }
        sc.close();
    }

    private void deleteAtEnd() {
        ListNode curr = head;

        if(curr == null || curr.next == null) {
            curr = null;
            System.out.println("List is empty");
            return;
        } else {
            while(curr.next.next != null) {
                curr = curr.next;
            }
        }
        curr.next = null;

        printLinkedList(head);
    }

    private void deleteAtStart() {
        ListNode curr = head;
        if(curr == null) return;
        else {
            curr = curr.next;
        }
        head = curr;
        printLinkedList(head);
    }

    private void printLinkedList(ListNode head) {
        ListNode temp = head;

        while(temp != null) {
            System.out.print(temp.val+ "-> ");
            temp = temp.next;
        }

        printCommands();
    }

    private void insertNodeAtStart(int data) {
        ListNode temp = new ListNode(data);
        temp.next = head;
        head = temp;
        System.out.println("Value inserted "+data);
        printLinkedList(head);
    }

    private void insertNodeAtEnd(int data) {
        ListNode curr = head;
        ListNode temp = new ListNode(data);
        if(curr == null) {
            temp.next = curr;
            curr = temp;
        } else {
            while(curr.next != null) {
                curr = curr.next;
            }
            curr.next = temp;
        }
        printLinkedList(head);
    }

    public static void main(String[] args) {
        DynamicLinkedList dll = new DynamicLinkedList();
        dll.printCommands();
    }
}
