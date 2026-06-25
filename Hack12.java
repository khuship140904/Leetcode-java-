import java.util.Scanner;
import java.util.regex.Pattern;

public class Hack12 {
    public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

        String[] arr = new String[testCases];

        for(int i=0;i<arr.length;i++){
           arr[i] = in.nextLine();
        }

         for(int i=0;i<arr.length;i++){
            try {
                Pattern.compile(arr[i]);
                System.out.println("Valid");
            } catch (Exception e) {
               System.out.println("Invalid");
            }
        }
	}
}
/*
([A-Z])(.+)
[AZ[a-z](a-z)
batcatpat(nat */