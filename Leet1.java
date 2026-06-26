//largest element in an array

public class Leet1 {
     public int largestElement(int[] nums) {
    
        int largest = nums[0];

        for(int i=0;i<nums.length;i++){
            if (nums[i]>largest) {
                largest=nums[i];
            }
        }
    return largest;
    }


    public static void main(String[] args){

    }
    
}
