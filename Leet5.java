//1967. Number of Strings That Appear as Substrings in Word

public class Leet5 {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(int i = 0 ; i<patterns.length;i++){
            if (word.contains(patterns[i])) {
                count++; 
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Leet5 leet5 = new Leet5();
        String[] patterns = {"a","abc","bc","d"};
        String word = "abc";

        System.out.println(leet5.numOfStrings(patterns,word));
    }
    
}
