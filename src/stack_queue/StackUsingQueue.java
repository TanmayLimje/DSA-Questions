package stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    private Queue<Integer> queue1 = new LinkedList<> ();
    private Queue<Integer> queue2 = new LinkedList<> ();

    public void push(int val){
        queue2.add (val);

        while (!queue1.isEmpty ()){
            queue2.add (queue1.remove ());
        }

        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    public int pop(){
        if(queue1.isEmpty ()){
            System.out.println ("empty stack");
            return -1;
        }
        return queue1.remove ();
    }

    public int top(){
        if(queue1.isEmpty ()){
            System.out.println ("empty stack");
            return -1;
        }
        return queue1.peek ();
    }

    public static void main (String[] args) {
        StackUsingQueue stack = new StackUsingQueue ();
        stack.push (12);
        stack.push (42);
        stack.push (62);
        stack.push (22);

        System.out.println (stack.pop ());
        System.out.println (stack.top ());

    }
}
