class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Palindrome {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        ListNode slow = head, fast = head, prev = null, temp = null;

        // Find the middle of the linked list
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }

        // If the length is odd, skip the middle element
        if (fast != null) slow = slow.next;

        // Compare the two halves
        while (slow != null) {
            if (slow.val != prev.val) return false;
            slow = slow.next;
            prev = prev.next;
        }

        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(2);
        head1.next.next.next = new ListNode(1);

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);

        System.out.println(solution.isPalindrome(head1)); // Output: true
        System.out.println(solution.isPalindrome(head2)); // Output: false
    }
}