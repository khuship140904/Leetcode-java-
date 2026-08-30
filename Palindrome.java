public class Palindrome {
    public boolean isPalindrome(int n){
       int rev = 0;
       int temp = n;

       while(temp>0){
        int digit = temp % 10;
        rev = rev*10 + digit;
        temp = temp/10;
       }

       if (rev==n) {
        return true;
       }else{return false;}


    }
    public static void main(String[] args) {
        Palindrome palin = new Palindrome();

        System.out.println(palin.isPalindrome(123));
    }
}
