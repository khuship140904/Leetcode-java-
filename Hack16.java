import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Hack16 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();

       boolean probable =  n.isProbablePrime(100);
       
       if(probable){
        System.out.println("prime");
       }else{
        System.out.println("not prime");
       }

      // System.out.println(probable);
    }
}


