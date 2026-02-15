//7. Reverse Integer

public class D {
    public int reverse(int x) {
        int rev = 0;

        while(x!=0) {
        int digit = x % 10; 
        if (rev > Integer.MAX_VALUE / 10 || 
                rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
        rev = rev * 10 + digit; 
        x = x/10;            
        }
        return rev;
    }

    public static void main(String[] args) {
        D d = new D();

        int x = -123;

        System.out.println(d.reverse(x));


    }
}
    

