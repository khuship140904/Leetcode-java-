import java.util.Arrays;

public class gfg8 {
    static int areAnagram(String S1, String S2) {

        String a1 = S1.toLowerCase();
        String b1 = S2.toLowerCase();

        int result = 0;

        if(a1.length()==b1.length()){
            char[] a2 = a1.toCharArray();
            char[] b2 = b1.toCharArray();

            Arrays.sort(a2);
            Arrays.sort(b2);

            String a3 = new String(a2);
            String b3 = new String(b2);

            if(a3.equals(b3)){
                result = 1;
            }
        }
        else{
            result = 0;
        }

        return result;
    
}

    public static void main(String[] args) {
        System.out.println(areAnagram("hello" , "olleh"));
    }
    
}
