// You are given a doubly linked list, which contains nodes that have a next pointer, a previous pointer, and an additional child pointer. This child pointer may or may not point to a separate doubly linked list, also containing these special nodes. These child lists may have one or more children of their own, and so on, to produce a multilevel data structure as shown in the example below.
// Given the head of the first level of the list, flatten the list so that all the nodes appear in a single-level, doubly linked list. Let curr be a node with a child list. The nodes in the child list should appear after curr and before curr.next in the flattened list.
// Return the head of the flattened list. The nodes in the list must have all of their child pointers set to null.

// Input: head = [1,2,3,4,5,6,null,null,null,7,8,9,10,null,null,11,12]
// Output: [1,2,3,7,8,11,12,9,10,4,5,6]



class Node{
    int val;
    Node next;
    Node prev;
    Node child;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
        this.child = null;
    }
}

public class Merge_Multilevel_DLL {

    public static Node buildMultiLevelDLL(Object[] nodes){
        Node head = new Node((int) nodes[0]);
        Node currentNode = head;

        for (int i = 1; i < nodes.length; i++) {
            Object val = nodes[i];
            Node nextNode;

            if (val instanceof Object[]) {
                nextNode = buildMultiLevelDLL((Object[]) val);
                currentNode.child = nextNode;
                continue;
            }

            nextNode = new Node((int) val);
            currentNode.next = nextNode;
            nextNode.prev = currentNode;
            currentNode = nextNode;
        }

        return head;
    }

    public static void printListMulti(Node head) {
        if (head == null) return;

        System.out.print(head.val+ " ");

        if (head.child != null) {
            printListMulti(head.child);
        }

        printListMulti(head.next);
    }

    public static Node flatten(Node head) {
        if (head == null) return head;

        Node currentNode = head;

        while (currentNode != null) {
            if (currentNode.child == null) {
                currentNode = currentNode.next;
            } 
            else {
                Node tail = currentNode.child;
                while (tail.next != null) {
                    tail = tail.next;
                }
                
                tail.next = currentNode.next;
                if (tail.next != null) {
                    tail.next.prev = tail;
                }
                
                currentNode.next = currentNode.child;
                currentNode.next.prev = currentNode;
                currentNode.child = null;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        Object[] nodes = {1, new Object[]{2, 7, new Object[]{8, 10, 11}, 9}, 3, 4, new Object[]{5, 12, 13}, 6};
        
        Node multiLinkedList = buildMultiLevelDLL(nodes);
        
        System.out.println("Original Multi-level List:");
        printListMulti(multiLinkedList);
        
        Node flattenedList = flatten(multiLinkedList);
        
        System.out.println("\nFlattened List:");
        printListMulti(flattenedList);
    }
}
