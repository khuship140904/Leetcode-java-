//1. Two sum 

// class A {
//     public int[] twoSum(int[] nums, int target) {
//         int[] arr= new int[2];

//         for(int i=0;i<nums.length;i++){
//            for(int j=i+1;j<nums.length;j++){
//             if ((nums[i]+nums[j])==target) {
//              arr[0]=i;
//              arr[1]=j;   
//              return arr;  
//             } 
//         }
//         }
//         return arr;
//     }

//     public static void main(String[] args) {

//          A obj = new A();

//         int[] nums = {3,3};
//         int[] result = obj.twoSum(nums, 6);

//         System.out.println("["+result[0]+","+result[1]+"]");

       
//     }
// }


public class A {

    public boolean findsum(int[] arr , int target){
        
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==target) {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        A a = new A();

        int[] arr ={3,5,7,8,12,15};

        a.findsum(arr, 19);

        System.out.println(a.findsum(arr, 19));
    }

    
}