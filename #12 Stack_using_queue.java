package Queue_using_Stack;

import java.util.Stack;

public class Queue {
    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public Queue(){
        this.s1 = new Stack<>();
        this.s2 = new Stack<>();
    }

    public void push(int x){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(x);

        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public int pop(){
        return s1.pop();
    }

    public int peek(){
        return s1.peek();
    }

    public boolean empty(){
        return s1.isEmpty();
    }
}


public class Main {
    public static void main(String [] arg){
        Queue q = new Queue();

        q.push(3);
        q.push(4);
        q.push(7);

        System.out.println(q.peek());
        System.out.println(q.empty());
        System.out.println(q.pop());
        System.out.println(q.peek());

    }
}
