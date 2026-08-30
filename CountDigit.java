public class CountDigit {

    public int countDigit(int n) {
        int count = 0;
        int temp = n;

        while(temp>0){
            temp = temp/10;
            count++;
        }

        if (n==0) {
            count=1;
            
        }

        return count;

    }

    public static void main(String[] args) {
       CountDigit cd = new CountDigit();
       System.out.println(cd.countDigit(1243)); 
    }
    
}
