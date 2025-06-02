package arrays;

public class Stack {
    int[] stack;
    int top;
    int capacity;

    public Stack (int size) {
        capacity = size;
        stack = new int[size];
        top = -1;
    }

    public void push (int val) {
        if (isFull ()) {
            System.out.println ("Stack full");
            return;
        }
        stack[++top] = val;

    }

    public int pop(){
        if(isEmpty ()){
            System.out.println ("nothing to pop");
            return -1;
        }
        return stack[top--];
//        top--;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println ("stack empty");
            return -1;
        }
        return stack[top];
    }

    public boolean isFull(){
        return top == capacity-1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void printStack(){
        if(isEmpty ()){
            System.out.println ("stack empty");
            return;
        }
        System.out.println ("\n stack->");
        for (int i = 0; i <= top; i++){
            System.out.print (stack[i] + " ");
        }
        System.out.println ();
    }

    public static void main (String[] args) {
        Stack myStack = new Stack (5);

        myStack.push (10);
        myStack.push (11);
        myStack.push (44);
        myStack.push (41);
        myStack.push (46);

        myStack.printStack ();

        int pop = myStack.pop ();
        myStack.printStack ();
    }
}
