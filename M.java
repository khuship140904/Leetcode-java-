import java.util.ArrayList;

public class M {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(50);
        list.add(40);

        //print arraylist
        System.err.println(list);

        //get specific element
        System.out.println(list.get(0));

        //remove specific element
        list.remove(2);

        //get the size of arraylist
        System.out.println(list.size());

        //get element using loops
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //get elements using enhanced for  loop
        for (int num : list) {
            System.out.println(num);
        }

        //find if element exist
        int target = 100;
        if (list.contains(target)) {
            System.out.println("Yes");
        }else{
                System.out.println("No");
            }

        //get max element in an arraylist
            int max= list.get(0);
            for(int i =0;i<list.size();i++){ 
            
            if (list.get(i)>max) {
                max=list.get(i);
            }
        } 
        System.out.println(max); 

        //get min element
            int min= list.get(0);
            for(int i =0;i<list.size();i++){ 
            
            if (list.get(i)<min) {
                min=list.get(i);
            }
        } 
        System.out.println(min); 
     
        
        //get sum of all elements
        int num = list.get(0);
        for(int i = 0; i<list.size() ;i++){
           num = num+list.get(i);
        }
        System.out.println(num);

    }
}


   //old capacity+ old capacity/2 = new capacity