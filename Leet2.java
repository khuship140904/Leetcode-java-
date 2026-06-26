//242. Valid Anagram

import java.util.Arrays;

public class Leet2 {
     public boolean isAnagram(String s, String t) {

        String a1 = s.toLowerCase();
        String b1 = t.toLowerCase();

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
    
}
