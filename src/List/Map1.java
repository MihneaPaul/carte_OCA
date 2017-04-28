package List;
import java.util.*;
/**
 * Created by Mihnea on 27.04.2017.
 */
public class Map1 {
    Map<String, String> hashAnimals = new HashMap<>(3);
    public void add2Hash() {
        hashAnimals.put("koala","bamboo");
        hashAnimals.put("lion","meat");
        hashAnimals.put("giraffe","leaf");

        System.out.println(hashAnimals);
        System.out.println(hashAnimals.get("koala"));
        for(String key : hashAnimals.keySet())
            System.out.println("key: "+key);
        System.out.println(hashAnimals.containsKey("lion"));
        System.out.println(hashAnimals.containsValue("leaf"));
        System.out.println(hashAnimals.size());
    }

    static Map<String, String> treeAnimals = new TreeMap<>();
    public void add2Tree() {
        treeAnimals.put("cat","whiskas");
        treeAnimals.put("penguin","fish");
        treeAnimals.put("women","money");

        System.out.println(treeAnimals);
        System.out.println(treeAnimals.get("penguin"));
        for(String key : treeAnimals.keySet())
            System.out.println("key: "+key);
        System.out.println(treeAnimals.containsKey("women"));
        System.out.println(treeAnimals.containsValue("whiskas"));
        System.out.println(treeAnimals.size());

    }

    public static void main(String[] args) {
        Map1 map = new Map1();
        map.add2Hash();
        map.add2Tree();

    }
}
