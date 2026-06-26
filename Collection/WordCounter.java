package Collection;
import java.util.*;

public class WordCounter {
    public static void main(String args[]){
        HashMap<String, Integer> map = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();
        String[] word = sentence.split(" ");
        for(int i=0;i<word.length;i++){
            for(int j=0;j<word[i].length();j++){
                if(map.containsKey(word[i][j])){
                    map.containKey(word[i][j], ++1);
                }
            }
        }

    }
}
