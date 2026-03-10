//second largest number 

public class L {

    public int secondLarge(int[] arr){
        int max =0;
        int secondmax =0;
        
        for(int i = 0 ; i<arr.length;i++){
            if (arr[i]>arr[max]){
                max=i;
                if (arr[i]<arr[max]){
                    secondmax=i;
                    
                }
            }
        }
        return secondmax;
    }
    

    public static void main(String[] args){

        L l = new L();

        int[] arr = {1,2,3,67,43,56,22};

        System.out.println(l.secondLarge(arr));
    
        
    }
    
}
