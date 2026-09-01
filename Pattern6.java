/*
1234
123
12
1
 */

public class Pattern6 {
    public void pattern6(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++
            ){
                System.out.print(j);
            }
            System.out.println();
        }

    }
     public static void main(String[] args) {
        Pattern6 p6 = new Pattern6();
        p6.pattern6(6);
    }
}


