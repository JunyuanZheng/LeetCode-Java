import share.ListNode;

public class Question234 {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null)
            slow = slow.next;
        slow = reverse(slow);
        fast = head;
        while (slow != null && fast != null) {
            if (fast.val != slow.val)
                return false;
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

    private ListNode reverse(ListNode node) {
        if (node == null || node.next == null)
            return node;
        ListNode tmp = reverse(node.next);
        node.next.next = node;
        node.next = null;
        return tmp;
    }
}
