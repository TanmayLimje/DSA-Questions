package stack_queue;

public class Stack {
    private Node top;
    private int height;

    public Stack (int val) {
        Node newNode = new Node (val);
        top = newNode;
        height = 1;
    }

    public void printStack () {
        Node temp = top;
        while (temp != null) {
            System.out.println (temp.value);
            temp = temp.next;
        }

    }

    public void push (int val) {
        Node newNode = new Node (val);
        if(height == 0){
            top = newNode;
        }else{
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    public Node pop(){
        if (height == 0) return null;

        Node temp = top;
        top = top.next;
        temp.next = null;

        height--;
        return temp;
    }
}
