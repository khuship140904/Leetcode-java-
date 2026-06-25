import java.util.Scanner;

public class Hack11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine().trim();
        // String[] arr = s.split("[\s.,\/#!\$%\^&\*;:{}=\-_~()]+`");

        if(s.length() == 0){
            System.out.println(0);
            scan.close();
            return;
        }

        String[] arr = s.split("[\\s!,?._'@]+");

        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(!arr[i].isEmpty()){
                count++;
            }
        }

        System.out.println(count);

        for(int i = 0; i < arr.length; i++){
            if(!arr[i].isEmpty()){
                System.out.println(arr[i]);
            }
        }

        scan.close();
    }
}
//exclamation points (!), commas (,), question marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).