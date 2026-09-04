public class MergeSortedArray {

    public int[] mergeArray(int[] nums1, int[] nums2){
        int[] answers = new int[nums1.length+nums2.length];
        int pos = 0;

        
        for(int i=0,j=0;i<nums1.length;j++,i++){
            if (nums1[i]>nums2[j]) {
                answers[pos++] = nums2[j];
                answers[pos++] = nums1[i]; 
            }else if(nums1[i]<=nums2[j]) {
                answers[pos++] = nums1[i];
                answers[pos++] = nums2[j];
            }else{
                if(nums1.length>nums2.length){
                  answers[pos++]=nums1[i];
                }else{
                    answers[pos++]=nums2[j];
                }

            }
        }

        return answers;
    }


    public static void main(String[] args) {
        MergeSortedArray msa = new MergeSortedArray();
        int[] nums1 = {1, 4, 7}; 
        int[] nums2 = {2, 3, 8, 9}; 

        int[] arr = msa.mergeArray(nums1,nums2);

        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
