public class ForLoop {

    public int forLoop(int low , int high){
        int sum = 0;

        for(int i = low ; i<=high ; i++){
            sum = sum + i ;
        }

        return sum ;
    }

    public static void main(String[] args) {
        ForLoop fl = new ForLoop();

        int sum = fl.forLoop(3, 7);
        System.out.println(sum);
    }
    
}
