public class Armstrong {
    public boolean isArmstrong(int n) {
        int temp = n;
        int count = 0;

        while(temp>0){
            temp = temp /10;
            count++;
        }

        int temp1= n;
        int sum = 0;

        while(temp1>0){
            int digit = temp1%10;
            sum = sum + (int)Math.pow(digit, count);
            temp1 = temp1/10;
        }

        return n==sum;

    }

    public static void main(String[] args) {
        Armstrong arm = new Armstrong();
       System.out.println(arm.isArmstrong(153)); ;
    }
    
}
