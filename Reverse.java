public class Reverse {
    public int reverseNumber(int n) {
       int rev = 0;
       int temp = n;

       while(temp>0){
        int digit = temp % 10;
        rev = rev*10 + digit;
        temp = temp/10;
       }

       return rev;

    } 

    public static void main(String[] args) {
        Reverse r = new Reverse();
        System.out.println(r.reverseNumber(25));
    }
}
