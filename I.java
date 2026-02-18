//26. Remove Duplicates from Sorted Array

public class I {
    public int removeDuplicates(int[] nums) {
       
        int x=0;
        

        for(int i=0 ; i<nums.length;i++){
                if (nums[i]>nums[x]) {
                    x++;
                    nums[x]=nums[i];


                }
            
        }
        return x+1;
    }

    public static void main(String[] args){
        int[] nums ={1,1,2};

        I i = new I();

        System.out.println(i.removeDuplicates(nums));

    }
}
