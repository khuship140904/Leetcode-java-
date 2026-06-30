//check if the array is sorted 

import java.util.Scanner;

public class DSA3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0 ; i<n;i++){
            arr[i] = sc.nextInt();
        }

         for(int i=1 ; i<n;i++){
            if(arr[0]>arr[1]){
                System.out.println("array is not sorted");
                break;
            }
        }
    }
    
}
