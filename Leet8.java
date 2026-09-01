public class Leet8 {
     public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] answers = new int[n];

        int prefix = 1;

        for(int i = 0 ; i<n ; i++){
           answers[i]=prefix;
           prefix = prefix*nums[i];
        }

        int sufix = 1;

        for(int i = n-1 ; i>=0 ; i--){
            answers[i] = answers[i]*sufix;
            sufix = sufix * nums[i];
           
        }

    return answers;
    }
    
}
