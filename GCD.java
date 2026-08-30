public class GCD {
    public int GCD(int n1, int n2) {
        int gcd = 1;

        for(int i=1,j=0;i<n1;i++,j++){
            if(n1%i==0 && n2%i==0){
                gcd = i;
            }
        }

        return gcd;
    }

    public static void main(String[] args) {
        GCD gcd = new GCD();
        System.out.println(gcd.GCD(6,12));
        
    }
}