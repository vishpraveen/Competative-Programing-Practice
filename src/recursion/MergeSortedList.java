package recursion;

public class MergeSortedList {
    
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        //1,2,6,3,4,5,6
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(6);
        list1.next.next.next = new ListNode(3);
        list1.next.next.next.next = new ListNode(4);
        list1.next.next.next.next.next = new ListNode(5);
        list1.next.next.next.next.next.next = new ListNode(6);

        // printLL(list1);
        System.out.println("");
        // removeValueFromList(list1, 6);
        ListNode ll = removeElements(list1, 6);
        System.out.println("");
        printLL(ll);
    }

    public static ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        head.next = removeElements(head.next, val);
        printLL(head);
        System.out.println("");
        return head.val == val ? head.next : head;
    }

    public static void removeValue(ListNode head, int val) {
        ListNode cur = head;
        ListNode prev = null;

        while(cur.next != null) {
            
            prev = cur;
            cur = cur.next;
            printLL(prev);
            System.out.println("");
        }
    }

    public static void removeValueFromList(ListNode head, int val) {
        ListNode curr = head;
        ListNode prev = null;
        
        while(curr.next != null) {
            if(curr.val == val) {
                ListNode next = curr.next;
                curr = next.next;
                next.next = prev;
                prev = next;
               
            } else {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
        }

        printLL(prev);
    }

    public static void printLL(ListNode head) {
        while(head != null) {
            System.out.print(head.val+" -> ");
            head = head.next;
        }
    }
}
