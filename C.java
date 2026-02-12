public class C {
    public boolean isPalindrome(int x) {
    boolean flag=false;

    int number = x;
    int reverse = 0;

    while(number > 0) {
        int digit = number % 10;      // last digit nikala
        reverse = reverse * 10 + digit;
        number = number/10;            // last digit hata diya
        }

        if (x==reverse){
          flag=true;
        }else{
         flag=false;
        }
         return flag;
    }

    public static void main(String[] args) {
        C c = new C();
    
        int x=-121;
        boolean flag = c.isPalindrome(x);
        System.out.println(flag);
    }

}
