//1796. Second Largest Digit in a String

public class B {
    public int secondHighest(String s) {
        int highest = -1;
        int secondhighest = -1;
        
        for(int i=0;i<s.length();i++){
        
         //ek ek character ko visit kara string ke 
         Character c = s.charAt(i);

         //check karo ki character digit hai yaa nahi 
            if(Character.isDigit(c)) {

              //agar true hua toh number variable me assign karo 
              //yaha - '0' isliye kara hai kyoki character me number ki value bhi ascii value pe 
              // store hoti hai toh usko integer me convert karne ke liye esa kara 
              int num = c -'0';

                if(num>highest) {
                secondhighest=highest;
                highest=num;

                }else if (num>secondhighest && num!=highest){
                secondhighest=num;  
                }
           }
        }
        
        return secondhighest;
    }

     public static void main(String[] args) {
        B obj = new B();

        String s = "abc5161";

        int secondhigh = obj.secondHighest(s);

        System.out.println(secondhigh);
    }
}
