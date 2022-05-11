package ds;

public class LinkedList {
    
    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    ListNode head;

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertNode(8, ll.head);
        ll.insertNode(4, ll.head);
        ll.insertNode(6, ll.head);
       ll.printList(ll.head);
    }

    void insertArrToList() {
        int[] nums = {5, 3, 6, 2, 7};

        for(int num: nums) {
            insertNode(num, this.head);
        }
        printList(this.head);
    }

    void printList(ListNode head) {
        ListNode curr = head;
        System.out.print("Printing Node...");  
        while(curr != null) {
            System.out.print(curr.val +"-> ");
            curr = curr.next;
        }

        System.out.println("\n");
    }
    
    void insertNode(int value, ListNode list) {
        ListNode node;

        if(list == null) {
            node = new ListNode(value);
            list = node;
        }
        else {
            ListNode curr = list;

            while(curr.next != null) {
                curr = curr.next;   
            }
            node = new ListNode(value);
            curr.next = node; 
            list = curr;
        }
    }
} 
