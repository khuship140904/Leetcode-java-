import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Hack29 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0 ; i<n ; i++){
            list.add(sc.nextInt());
        }

        //System.out.println(list);

        int queries = sc.nextInt();

        for(int i = 0 ; i<queries ; i++){
            String str = sc.next();

            if(str.equals("Insert")) {
                int x = sc.nextInt();
                int y = sc.nextInt();

                list.add(x,y);  
               // System.out.println(list);
            }

            if(str.equals("Delete")){
                int y = sc.nextInt();


                list.remove(y);

               // System.out.println(list);
            }

        }
        for(int i = 0 ; i<list.size() ; i++){
            System.out.print(list.get(i)+" ");
            
        }

        sc.close();
    }
}

