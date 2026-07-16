import java.util.Scanner;

//input boolean value
public class gfg23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean a;

        // code here
        boolean a = sc.hasNextBoolean();

        // Printing numeric representation
        System.out.print(a ? 1 : 0);
    }
}
