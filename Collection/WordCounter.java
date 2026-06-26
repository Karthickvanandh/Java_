package Collection;
import java.util.*;

public class WordCounter {
    public static void main(String args[]){
        HashMap<String, Integer> map = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();
        String[] word = sentence.split(" ");
        for(int i=0;i<word.length;i++){
            if(map.containsKey(word[i])){
                map.put(word[i], map.get(word[i]) + 1);
            }else{
                map.put(word[i], 1);
            }
        }
        System.out.println(map);
    }
}
