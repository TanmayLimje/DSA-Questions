// Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes of the list from position left to position right, and return the reversed list.

// Input: head = [1,2,3,4,5], left = 2, right = 4
// Output: [1,4,3,2,5]

// Input: head = [5], left = 1, right = 1
// Output: [5]
 

class ListNode{
    int val;
    ListNode next;

    public ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

class MN_Reverse_LL {

    public static ListNode reverseBetween(ListNode head, int left, int right){
        int currentPos = 1;
        ListNode currentNode = head;
        ListNode start = head;

        while(currentPos < left){
            start = currentNode;
            currentNode = currentNode.next;
            currentPos++;
        }

        ListNode newList = null;
        ListNode tail = currentNode;

        while (currentPos >= left && currentPos <= right){
            ListNode next = currentNode.next;
            currentNode.next = newList;
            newList = currentNode;
            currentNode = next;
            currentPos++;
        }

        start.next = newList;
        tail.next = currentNode;

        if(left > 1) return head;
        else return newList;
    }

    public static void printList(ListNode head){
        while (head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String [] arg){
        int [] values = {5,4,3,2,1};
        ListNode linkedList = null;

        for(int value: values){
            ListNode newNode = new ListNode(value);
            newNode.next = linkedList;
            linkedList = newNode;
        }

        System.out.println("orignal LL: ");
        printList(linkedList);

        System.out.println("MN reversal at 2,4 LL: ");
        ListNode result = reverseBetween(linkedList, 2, 4);
        printList(result);
    }

}
