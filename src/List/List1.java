package List;

import java.util.*;

/**
 * Created by Mihnea on 27.04.2017.
 */
public class List1 {
    public static void main(String[] args) {
        List<String> birds = new ArrayList<>();
        birds.add("Sparrow");
        System.out.println(birds);
        Set<String> set = new HashSet<>();
        set.add("Sparrow");
        set.add("Sparrow");
        System.out.println(set);
        birds.add("Hawk");
        birds.add("Hawk");
        System.out.println(birds);
        birds.remove("Hawk");
        System.out.println(birds);
        birds.remove(0);
        System.out.println(birds);
        set.add("Hawk");
        set.add("Robin");
        set.add("Raven");
        System.out.println(set);
        Set<String> set2 = new TreeSet<>();
        set2.add("Sparrow");
        set2.add("Hawk");
        set2.add("Robin");
        set2.add("Raven");
        System.out.println(set2);
        System.out.println();
        Queue<Integer> qiu = new ArrayDeque<>();

        for(int i=0;i<10;i++) {
            qiu.offer(i);
        }
        System.out.println(qiu);
        System.out.println(qiu.peek());
        System.out.println(qiu);
        System.out.println(qiu.poll());
        System.out.println(qiu);
        System.out.println(qiu.poll());
        System.out.println(qiu);
        System.out.println(qiu.peek());
        System.out.println(qiu);
        System.out.println(qiu.poll());
        System.out.println(qiu);
        System.out.println(qiu.poll());
        System.out.println(qiu);
        System.out.println(qiu.poll());
        System.out.println(qiu);
        System.out.println(qiu.peek());

    }
}
