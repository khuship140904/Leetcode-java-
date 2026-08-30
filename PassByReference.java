public class PassByReference {
    public void reverse(int[] arr){
        for(int i=0,j=arr.length-1; i<j;i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
     public static void main(String[] args) {
        PassByReference pbr = new PassByReference();
        int[] arr = {1,2,3,4,5,6};
        pbr.reverse(arr);
     }
}
