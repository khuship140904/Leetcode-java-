import java.util.Scanner;

class InputOutput {
    public void PrintNumber(Scanner Sc){
        int num = Sc.nextInt();
        System.out.println(num);
    }

    public static void main(String[] args) {
        InputOutput sol = new InputOutput();
        sol.PrintNumber(new Scanner(System.in));
    }
}