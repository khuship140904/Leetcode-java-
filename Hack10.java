//Java Anagrams

import java.util.Arrays;
import java.util.Scanner;

public class Hack10 {
     static boolean isAnagram(String a, String b) {
        
        String a1 = a.toLowerCase();
        String b1 = b.toLowerCase();

        boolean y = false;

        if(a1.length()==b1.length()){
            char[] a2 = a1.toCharArray();
            char[] b2 = b1.toCharArray();

            Arrays.sort(a2);
            Arrays.sort(b2);

            String a3 = new String(a2);
            String b3 = new String(b2);

            if(a3.equals(b3)){
                y=true;
            }

        }else{
            y=false;
        }

        return y;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
    
}
