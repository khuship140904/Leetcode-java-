//744. Find Smallest Letter Greater Than Target

public class Leet4 {
    public char nextGreatestLetter(char[] letters, char target) {
        char output = letters[0];

        for(int i = 0;i<letters.length;i++){
            if(target<letters[i]){
                output = letters[i]; 
                break;
            }

        }


       return output; 
    }

    public static void main(String[] args) {

        Leet4 leet4 = new Leet4();
        char[] letters = {'c','f','j'};
        char target = 'a';

        System.out.println(leet4.nextGreatestLetter(letters, target));
    }
    
}
