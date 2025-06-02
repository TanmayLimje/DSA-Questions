package hash_table;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        HashTable table = new HashTable ();
        table.set ("nails", 100);
        table.set ("tile", 50);
        table.set ("lumber", 100);
        table.set ("bolts", 100);
        table.set ("screws", 100);

        System.out.println (table.get ("tile"));


        table.printTable ();

        ArrayList keys = table.keys ();
        System.out.println (keys);
    }
}
