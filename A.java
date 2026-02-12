//1. Two sum 

class A {
    public int[] twoSum(int[] nums, int target) {
        int[] arr= new int[2];

        for(int i=0;i<nums.length;i++){
           for(int j=i+1;j<nums.length;j++){
            if ((nums[i]+nums[j])==target) {
             arr[0]=i;
             arr[1]=j;   
             return arr;  
            } 
        }
        }
        return arr;
    }

    public static void main(String[] args) {

         A obj = new A();

        int[] nums = {3,3};
        int[] result = obj.twoSum(nums, 6);

        System.out.println("["+result[0]+","+result[1]+"]");

       
    }
}