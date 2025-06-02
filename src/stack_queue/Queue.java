package stack_queue;

public class Queue {
    private Node first;
    private Node last;
    private int length;

    public Queue (int val) {
        Node newNode = new Node (val);
        last = newNode;
        first = newNode;
        length = 1;
    }

    public void printQueue () {
        Node temp = first;
        while (temp != null) {
            System.out.println (temp.value);
            temp = temp.next;
        }
    }

    public void enqueu (int val) {
        Node newNode = new Node (val);

        if (length == 0) {
            last = newNode;
            first = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public Node dequeue () {
        Node temp = first;

        if (length == 0) return null;
        if (length == 1) {
            first = null;
            last = null;
        } else {
            first = first.next;
            temp.next = null;
        }
        return temp;
    }
}
