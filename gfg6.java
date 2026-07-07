import java.util.ArrayList;
//Java 1-d and 2-d Array
public class gfg6 {
    public static ArrayList<Integer> array(int a[][], int b[], int n) {
        int diagonalSum = 0;
        for(int i = 0 ; i<a.length ; i++){
            for(int j=0;j<a[i].length ; j++){
                if(i==j){
                    diagonalSum = diagonalSum + a[i][j];
                }
            }
        }
        
        int largest = 0;
        for(int i = 0 ; i<b.length ; i++){
            if(b[i]>largest){
                largest = b[i];
            }
        }

        ArrayList<Integer> output = new ArrayList<>();

        output.add(diagonalSum);
        output.add(largest);

        return output;
    }
}
