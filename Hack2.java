//Java Stdin and Stdout II

import java.util.Scanner;

public class Hack2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a  = sc.nextInt();
        double b = sc.nextDouble();
        sc.nextLine();
        String c = sc.nextLine();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        sc.close();
    }
    
}
