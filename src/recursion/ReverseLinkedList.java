package recursion;

public class ReverseLinkedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void printLL(ListNode head) {
        ListNode curr = head;
        while(curr != null) {
            System.out.print(curr.val+ "->");
            curr = curr.next;
        }
    } 

    public static void printRecur(ListNode head) {
        if (head != null) {
            System.out.print(head.val+"->");
            printRecur(head.next);
        } 
    }

    public static ListNode reverseLinkedListInPair(ListNode head) {
        if ((head == null || head.next == null)) return head;
        else  {
            ListNode temp = new ListNode(head.val);
            head.val = head.next.val;
            head.next.val = temp.val;
            head.next.next = reverseLinkedListInPair(head.next.next);
            return head;
        }
    }

    private static ListNode reverseLinkedList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null, forward = null;

        while(curr != null) {
           forward = curr.next;
           curr.next = prev;
           prev = curr;
           curr = forward; 
        }
        return prev;
    }

    public static ListNode recurRev(ListNode head) {
        // System.out.println(head.val+" ->");
        if(head == null || head.next == null) return head;
        ListNode temp = recurRev(head.next);
        System.out.println(temp.val+" ->");
        head.next.next = head;
        head.next = null;
        System.out.println(temp.next.val);
        printLL(temp);
        return temp;
        
    }

    public static void main(String[] args) {
        ListNode ll = new ListNode(1);
        ll.next = new ListNode(2);
        ll.next.next = new ListNode(3);
        ll.next.next.next = new ListNode(4);
        ll.next.next.next.next = new ListNode(5);
        ll.next.next.next.next.next = new ListNode(6);

        System.out.println("\nPrinting Recursively.\n");
        
        // printLL(reverseLinkedList(ll));
        recurRev(ll);
    }
}
