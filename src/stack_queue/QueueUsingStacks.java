package stack_queue;

import java.util.Stack;

public class QueueUsingStacks {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public QueueUsingStacks () {
        stack1 = new Stack<> ();
        stack2 = new Stack<> ();
    }

    public void enqueue (int val) {
        stack1.push (val);
    }

    public int dequeue () {
        if (stack2.isEmpty ()) {
            if (stack1.isEmpty ()) {
                System.out.println ("queue empty");
                return -1;
            }

            while (!stack1.isEmpty ()) {
                stack2.push (stack1.pop ());
            }
        }
        return stack2.pop ();
    }

    public int peek () {
        if (stack2.isEmpty ()) {
            if (stack1.isEmpty ()) {
                System.out.println ("queue empty");
                return -1;
            }
            while (!stack1.isEmpty ()) {
                stack2.push (stack1.pop ());
            }

        }
        return stack2.peek ();
    }

//


    public boolean iSEmpty(){
        return stack2.isEmpty () && stack1.isEmpty ();
    }

    public static void main (String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks ();

        queue.enqueue (12);
        queue.enqueue (15);
        queue.enqueue (121);

        System.out.println (queue.dequeue ());
        System.out.println (queue.peek ());

    }

}
