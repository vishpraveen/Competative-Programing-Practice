package linked_list;

public class LinkedListDemo {
    
    static ListNode head;

    public static void createList(int[] nums) {

        for(int i = 0; i < nums.length; i++) {
            ListNode temp = new ListNode(nums[i]);
            if(head == null) head = temp;
            else {
                temp.next = head;
                head = temp;
            }
        }

        printHead(head);
    }

    public static void printHead(ListNode head) {
        ListNode curr = head;
        while(curr != null) {
            System.out.print(curr.val + "-> ");
            curr = curr.next;
        }
    } 

    public static ListNode createListFromRecursion(ListNode list) {
        if(list == null || list.next == null) return list;
        ListNode curr = createListFromRecursion(list.next);
        list.next.next = list;
        list.next = null;
        return curr;
    }
    public static void main(String[] args) {
        int[] nums = {2, 5, 6, 3, 1, 7};    
        createList(nums);
        // ListNode head = new ListNode(2);
        // head.next = new ListNode(5);
        // head.next.next = new ListNode(6);
        // head.next.next.next = new ListNode(3);

        // ListNode list = createListFromRecursion(head);
        // printHead(list);
    }
}
