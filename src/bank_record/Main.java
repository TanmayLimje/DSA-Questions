package bank_record;

import java.util.*;

public class Main {
    public static void main (String[] arg) {
        List<List<String>> records = new ArrayList<> ();
//        records.add (new ArrayList<> (Arrays.asList ("Ac. no", "Name", "Opening Date", "Account balance")));
        records.add (new ArrayList<> (Arrays.asList ("789", "Charlie", "2022-01-15", "2500.00")));
        records.add (new ArrayList<> (Arrays.asList ("123", "Alice", "2021-05-01", "2000.00")));
        records.add (new ArrayList<> (Arrays.asList ("456", "Bob", "2020-11-20", "1500.00")));

        System.out.println (records);

        String colName = "Opening Date";
        String value = "2020-11-20";

        int index = getIndex (records, colName, value);
        System.out.println ("Index returned : " + index);
    }

    public static int getIndex (List<List<String>> records, String column, String value) {

        Map<String, Integer> colMap = new HashMap<> ();
        colMap.put ("Account Number", 0);
        colMap.put ("Account Holder Name", 1);
        colMap.put ("Opening Date", 2);
        colMap.put ("Account Balance", 3);

        int colIndex = colMap.get (column);

        int n = records.size ();
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                String val1 = records.get (j).get (colIndex);
                String val2 = records.get (j + 1).get (colIndex);

                int compareResults;
                if (column.equals ("Account Balance")) {
                    compareResults = Double.compare (Double.parseDouble (val1), Double.parseDouble (val2));
                } else {
                    compareResults = val1.compareTo (val2);
                }

                if (compareResults > 0) {
                    List<String> temp = records.get (j);
                    records.set (j, records.get (j + 1));
                    records.set (j + 1, temp);
                    swapped = true;
                }
            }

            if(!swapped) break;;
        }

        for (int i = 0 ;i < n; i++){
            if(records.get (i).get (colIndex).equals (value)){
                return i;
            }
        }

        return -1;
    }
}
