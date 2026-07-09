//Array insert at index

import java.util.ArrayList;

public class gfg20 {
    

    public static void main(String[] args) {
        gfg20 g20 = new gfg20();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        g20.insertAtIndex(arr, 5, 90);
        System.out.println(arr);
    }
}
    
public void insertAtIndex(ArrayList<Integer> arr, int index, int val) {
        arr.add(index, val);    
    }