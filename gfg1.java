//second largest

public class gfg1 {
    public int getSecondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = arr[0];
        
        for(int i = 0; i<arr.length ; i++){
            if(arr[i]>largest)
            largest=arr[i];
        }
        for(int i = 0; i<arr.length ; i++){
            if(arr[i]>secondLargest&& arr[i]!= largest)
            secondLargest=arr[i];
        }
        
        return secondLargest;
        
    }

    public static void main(String[] args) {
        int [] arr = {12, 35, 1, 10, 34, 1};

        gfg1 g1 = new gfg1();

        System.out.println(g1.getSecondLargest(arr));
    }
}

