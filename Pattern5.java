/*
****
***
**
*
 */

public class Pattern5 {
    public void pattern5(int n) {
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
     public static void main(String[] args) {
        Pattern5 p5 = new Pattern5();
        p5.pattern5(5);
    }
}


