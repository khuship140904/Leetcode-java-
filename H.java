//231. Power of Two

public class H {
    public boolean isPowerOfTwo(int n) {
        if (n<=0) {
            return false;
        }

        while (n%2==0) {
            n=n/2;   
        }

        return n==1;
    }

    public static void main(String[] args){
        H h = new H();

        int n=16;

        System.out.println(h.isPowerOfTwo(n));
    }
}
