//344. Reverse String

public class K {
    public void reverseString(char[] s) {
        int j=s.length-1;
        for(int i=0;i<s.length;i++){
            s[i]=s[j--];
            }   
    }
    public static void main(String[] args) {
        K k = new K();
        char[] s = {'h','e','l','l','o'};


        k.reverseString(s);

        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }
    
}
