public class WhileLoop {
    public int whileLoop(int d){
        int temp = d;
        int sum =0;
        int count = 0;

        while(count<50){
            sum = sum + temp;
            temp = temp +10;
            count++;
        }

        return sum;
    }


    public static void main(String[] args) {
        WhileLoop wl = new WhileLoop();
        System.out.println(wl.whileLoop(5));
    }
    
}
