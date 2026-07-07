//concatenate and reverse

public class gfg5 {
    static String conRevstr(String s1, String s2) {
        String output = s1 + s2;
        output.trim();

        char[] arr = new char[output.length()];
        int j = 0;
         for(int i = output.length()-1 ;i>=0;i--){
           char last =  output.charAt(i);

           arr[j] = last;

           j++;

         }

         String str = new String(arr);

         return str;
        
    }
}
