//Delete alternate characters

public class gfg7 {
    static String delAlternate(String s) {
        char[] arr = new char[s.length()];
        int j = 0;
    
        for(int i = 0 ; i < s.length() ; i=i+2){
            char even = s.charAt(i);
            
            arr[j] = even ;
            
            j++;
            
        }
        
        String Str = new String(arr);
        
        return Str;
        
    }

    public static void main(String[] args) {
        System.out.println(delAlternate("hello"));
    }
}
