public class I {
    public int removeDuplicates(int[] nums) {
        int size = -1;
        int count=0;

        int j=i+1;
        for(int i=0 ; i<nums.length-1;i++){

                if (nums[i]!=nums[j]) {
                    nums[j]=0;
                    count++; 
                    j++;
                    //nums[j]=0;
                }
            
        }

        System.out.println(count);

        for(int numbers:nums){
            System.out.println(numbers);
        }


        return size;
        
    }

    public static void main(String[] args){
        int[] nums ={1,1,2};

        I i = new I();

        i.removeDuplicates(nums);


    }
}
