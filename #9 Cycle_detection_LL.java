// Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
// There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.
// Do not modify the linked list.

public class Node {
    int value;
    Node next;

    public Node(int value){
        this.value = value;
        this.next = null;
    }
}


public class Main {

    public static Node findCycle(Node head){
        if(head == null) return null;

        Node fast = head;
        Node slow = head;

        while(true){
            slow = slow.next;
            fast = fast.next;

            if(fast == null || fast.next == null) return null;
            else fast= fast.next;


            if(slow == fast) break;
        }

        Node p1 = head;
        Node p2 = slow;

        if(p2 != p1){
            p1 = p1.next;
            p2 = p2.next;
        }

        return p1;
    }

    public static void main(String[] args){
        int [] values = {8,7,6,5,4,3,2,1};
        Node ll = null;

        for(int val: values){
            Node newNode = new Node(val);
            newNode.next = ll;
            ll = newNode;
        }

        Node current = ll;
        Node cycleNode = null;

        while(current.next != null){
            if(current.value == 3){
                cycleNode = current;
            }
            current = current.next;
        }

        current.next = cycleNode;

        //calling the function to detect cycle

        Node cycleStart = findCycle(ll);

        if(cycleStart != null){
            System.out.println("Cycle detected with the node of value: " + cycleStart.value);
        }else{
            System.out.println("No cycle detected!");
        }
    }
}
