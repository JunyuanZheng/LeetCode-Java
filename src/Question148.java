import share.ListNode;

public class Question148 {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode pre = null;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null && slow != null) {
            fast = fast.next.next;
            pre = slow;
            slow = slow.next;
        }

        pre.next = null;
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);
        return merge(l1, l2);
    }

    private ListNode merge(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        while (head1 != null || head2 != null) {
            if (head1 != null && head2 != null) {
                if (head1.val < head2.val) {
                    head.next = head1;
                    head1 = head1.next;
                } else {
                    head.next = head2;
                    head2 = head2.next;
                }
            } else if (head1 != null) {
                head.next = head1;
                head1 = head1.next;
            } else {
                head.next = head2;
                head2 = head2.next;
            }
            head = head.next;
        }
        return dummy;
    }
}
