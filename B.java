//1796. Second Largest Digit in a String

public class B {
     public int secondHighest(String s) {
        int high = -1;
        int secondhigh = -1;

        for(int i=0;i<s.length();i++){
         char c = s.charAt(i);

         if (Character.isDigit(c)) {

            int num = c -'0';

            if (num>high) {
                secondhigh=high;
                high=num;
            }else if (num>secondhigh && num!=high){
                secondhigh=num;  
            }
         }
        }
        return secondhigh;
    }

     public static void main(String[] args) {
        B obj = new B();

        String s = "abc1111";

        int secondhigh = obj.secondHighest(s);

        System.out.println(secondhigh);
    }
}
