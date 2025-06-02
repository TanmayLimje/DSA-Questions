package linked_list;

class ListNode {
    int val;
    ListNode next;

    ListNode (int val) {
        this.val = val;

    }
}

public class AddNumber {
    public static void main (String[] args) {
        ListNode l1 = new ListNode (9);
        l1.next = new ListNode (9);
        l1.next.next = new ListNode (9);

        ListNode l2 = new ListNode (8);
        l2.next = new ListNode (8);
        l2.next.next = new ListNode (8);

        printList (l1);
        printList (l2);


        ListNode result = addNumbers (l1, l2);
        printList (result);
    }

    public static void printList (ListNode head) {
        while (head != null) {
            System.out.print (head.val);
            if (head.next != null)
                System.out.print (" -> ");
            head = head.next;
        }
        System.out.println ();
    }

    public static ListNode addNumbers (ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode (0);
        ListNode curr = dummy;
        int carry = 0;

        while (l1 != null & l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            int sum = val1 + val2 + carry;
            carry = sum / 10;

            curr.next = new ListNode (sum % 10);
            curr = curr.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummy.next;
    }
}
