package linked_list;

import java.util.HashSet;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList (int value) {
        Node newNode = new Node (value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList () {
        Node temp = head;

        while (temp != null) {
            System.out.println (temp.value);
            temp = temp.next;
        }
    }

    public void append (int value) {
        Node newNode = new Node (value);

        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast () {
        if (length == 0) return null;

        Node temp = head;
        Node prev = head;

        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }

        tail = prev;
        tail.next = null;
        length--;

        if (length == 0) {
            head = null;
            tail = null;
        }

        return temp;
    }

    public void prepend (int value) {
        Node newNode = new Node (value);

        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst () {
        Node temp = head;

        if (length == 0) return null;

        head = head.next;
        temp.next = null;

        length--;

        if (length == 0) {
            tail = null;
        }

        return temp;
    }

    public Node get (int index) {
        if (index < 0 || index >= length) {
            return null;
        }

        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }

    public boolean set (int index, int value) {

        Node temp = get (index);

        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert (int value, int index) {

        if (index < 0 || index >= length) return false;

        if (index == 0) {
            prepend (value);
            return true;
        }
        if (index == length) {
            append (value);
            return true;
        }

        Node newNode = new Node (value);
        Node temp = get (index - 1);

        newNode.next = temp.next;
        temp.next = newNode;
        length++;

        return true;
    }

    public Node remove (int index) {
        if (index < 0 || index >= length) return null;
        if (index == 0) return removeFirst ();
        if (index == length - 1) return removeLast ();

        Node prev = get (index - 1);
        Node temp = prev.next;

        prev.next = temp.next;
        temp.next = null;

        length--;

        return temp;

    }

    public void reverse () {
        Node temp = head;
        head = tail;
        tail = temp;

        Node after = temp.next;
        Node before = null;

        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;

        }
    }

    public Node middleNode () {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean hasLoop () {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) return true;
        }
        return false;
    }

    public Node KthNodeFromEnd (int k) {
        Node fast = head;
        Node slow = head;

        for (int i = 0; i < k; i++) {
            if (fast == null) return null;
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public void removeDuplicates () {
        Node prev = null;
        Node curr = head;

        HashSet<Integer> val = new HashSet<> ();

        while (curr != null) {
            if (val.contains (curr.value)) {
                prev.next = curr.next;
                length--;
            } else {
                val.add (curr.value);
                prev = curr;
            }
            curr = curr.next;
        }
    }

    public void partitionList (int k) {
        Node dummy1 = new Node (0);
        Node dummy2 = new Node (0);

        Node prev1 = dummy1;
        Node prev2 = dummy2;

        Node temp = head;

        while (temp != null) {
            if (temp.value < k) {
                prev1.next = temp;
                prev1 = prev1.next;
            } else {
                prev2.next = temp;
                prev2 = prev2.next;
            }
            temp = temp.next;
        }

        prev2.next = null;
        prev1.next = dummy2.next;

        head = dummy1.next;

    }

    public void reverseBetween (int startIndex, int endIndex) {


        if (head == null) return;

        Node dummyNode = new Node (0);
        dummyNode.next = head;
        Node previousNode = dummyNode;

        for (int i = 0; i < startIndex; i++) {
            previousNode = previousNode.next;
        }

        Node currentNode = previousNode.next;

        for (int i = 0; i < endIndex - startIndex; i++) {
            Node nodeToMove = currentNode.next;
            currentNode.next = nodeToMove.next;
            nodeToMove.next = previousNode.next;
            previousNode.next = nodeToMove;
        }

        head = dummyNode.next;
    }

    public void swapPairs(){
        Node dummy = new Node (0);
        dummy.next = head;
        Node prev = dummy;
        Node first = head;

        while (first != null && first.next != null){
            Node second = first.next;
            prev.next = second;
            first.next = second.next;
            second.next = first;

            prev = first;
            first = first.next;
        }

        head =dummy.next;
    }
}
