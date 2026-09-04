public class FlipAnBinaryArray {
    public int[] flip(int[] arr){
        for(int i = 0 ; i< arr.length ; i++){
            if(arr[i]==0){
                arr[i]=1;
            }else{
                arr[i]=0;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        FlipAnBinaryArray faba = new FlipAnBinaryArray();
        int[] arr1 = {0,1,0,1,1};

        int[] arr = faba.flip(arr1);

        for(int i = 0 ; i< arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
