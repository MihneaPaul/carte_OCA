package List;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mihnea on 27.04.2017.
 */
public class WordOccurence {

    public void countWords(String input) {
        Map<String, Integer> map = new HashMap<>();
        if(input!=null) {
            String[] separatedWords = input.split(" ");
            for(String str : separatedWords) {
                if(map.containsKey(str)) {
                    int count = map.get(str);
                    map.put(str, count + 1);
                } else {
                    map.put(str,1);
                }
            }
        }
        System.out.println("Count:- "+map);
    }

    public static void main(String[] args) {
        WordOccurence wordOccurence = new WordOccurence();
        wordOccurence.countWords("aici si acolo si dincolo si chiar si aici e si acolo");
    }

}

