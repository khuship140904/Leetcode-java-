import java.util.ArrayList;
import java.util.Scanner;

public class Hack31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        
        for(int i=0;i<n;i++){

            int d = sc.nextInt();

            ArrayList<Integer> arrayy = new ArrayList<>();

            for(int j=0;j<d;j++){
                    arrayy.add(sc.nextInt());    
            }
              
            arr.add(arrayy);  
            }

           // System.out.println(arr);


    //         int querySize = sc.nextInt();

    //         ArrayList<ArrayList<Integer>> AllQueries = new ArrayList<>();

    //         for(int i = 0 ; i<querySize ; i++){
    //             ArrayList<Integer> queries = new ArrayList<>();
    //             for(int j = 0 ; j<2 ; j++){
    //              queries.add(sc.nextInt());
    //             }
    //             AllQueries.add(queries);
    //         }

    //         System.out.println(AllQueries);

    // for(int i = 0;i<querySize;i++)
    // {
    //     ArrayList arrayyIndex = AllQueries.get(i);
    //     int index = arrayyIndex.get(i);

    //     try {
    //         int element = arr.get(i).get(index);
    //         System.out.println(element);
    //     } catch (IndexOutOfBoundsException e) {
    //         System.out.println("ERROR!");
    //     }
    // }

    int q = sc.nextInt();

        // Process each query
        for (int i = 0; i < q; i++) {

            int x = sc.nextInt(); // Line number
            int y = sc.nextInt(); // Position

            try {
                System.out.println(arr.get(x - 1).get(y - 1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }

}
}


