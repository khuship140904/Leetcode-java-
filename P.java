//sum()
public class P {

    public int sum(int[] arr){
        int result=0;
        for(int i=0;i<arr.length;i++){
            result = result+arr[i];
        }
        return result;

    }

    public static void main(String[] args) {
        P p = new P();
        int[] arr ={2,45,32,33};
        System.out.println(p.sum(arr));
    }
    
}
