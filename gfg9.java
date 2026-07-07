//Are LinkedLists Equal
import java.util.LinkedList;

public class gfg9 {
     public static boolean areEqual(LinkedList<Integer> ll1, LinkedList<Integer> ll2) {
        boolean result = false;
        int count = 0;
        if(ll1.size()==ll2.size()){
            for(int i = 0 ; i <ll1.size() ; i++){
                if (ll1.get(i)==ll2.get(i)) {
                    count++;   
                }
            }
            if (count==ll1.size()) {
                result = true;
            }
        }
        else{
            result = false;
        }
        return result;
    }
}
