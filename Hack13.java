//Java Regex

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Hack13  {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
//Write your code here

class MyRegex {

    String zeroTo255 =
        "(\\d|\\d\\d|(0|1)\\d\\d|2[0-4]\\d|25[0-5])";

    String pattern =
        zeroTo255 + "\\." +
        zeroTo255 + "\\." +
        zeroTo255 + "\\." +
        zeroTo255;

}
