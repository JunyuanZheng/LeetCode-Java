import share.ListNode;

public class Question2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int overflow = 0;
        ListNode dummy = new ListNode(0);
        ListNode pointer = dummy;
        while (l1 != null || l2 != null || overflow != 0) {
            int v1 = l1 != null ? l1.val : 0;
            int v2 = l2 != null ? l2.val : 0;
            int v = v1 + v2 + overflow;
            pointer.next = new ListNode(v % 10);
            pointer = pointer.next;
            overflow = v / 10;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        return dummy.next;
    }
}
