package linked_list;

public class Main {
    public static void main(String [] arg){
        LinkedList myLL = new LinkedList (10);
        myLL.append (12);
        myLL.append (34);
        myLL.printList ();

        myLL.reverse ();
        myLL.printList ();
    }
}
