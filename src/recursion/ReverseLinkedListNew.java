package recursion;

public class ReverseLinkedListNew {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void printLL(ListNode node) {
        while(node != null) {
            System.out.print(node.val +"-> ");
            node = node.next;
        }
    }

    public static void reverseLLIterative(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        printLL(prev);
        System.out.println("\n");
    }

    public static ListNode reverseLLRev(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode temp = reverseLLRev(head.next);
        printLL(temp);
        System.out.println("\n");
        System.out.println("head:");
        printLL(head);
        System.out.println("\n");
        head.next.next = head;
        head.next = null;
        System.out.println("head after swap:");
        printLL(head);
        System.out.println("\n");
        return temp;
    }

    public static void main(String[] args) {
        ReverseLinkedListNew lln = new ReverseLinkedListNew();
        ListNode ll = lln.new ListNode(1);
        ll.next = lln.new ListNode(2);
        ll.next.next = lln.new ListNode(3);
        ll.next.next.next = lln.new ListNode(4);

        // reverseLLIterative(ll);

        printLL(reverseLLRev(ll));
    }
}
