//vowel or not

import java.util.Scanner;
public class gfg3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        // code here
        
    }
}
