//27. Remove Element

public class J {
    public int removeElement(int[] nums, int val) {
        int count =0;
        for(int i=0;i<nums.length;i++){
            if (nums[i]!=val) {
                nums[count]=nums[i]; 
                count++;
            }
        }
        return count;  
    }

    public static void main(String[] args) {
        int val = 3;
        int[] nums = {3,2,2,3};

        J j= new J();

        int count = j.removeElement(nums, val);

        System.out.println(count);
         
    }
    
}
