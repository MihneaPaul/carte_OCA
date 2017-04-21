import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Mihnea on 19.04.2017.
 */
public class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String speciesName, boolean hopper, boolean swimmer) {
        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
    }

    public boolean canHop() {
        return canHop;
    }
    public boolean canSwim() {
        return canSwim;
    }
    public String toString() {
        return species;
    }
}

interface CheckTrait {
boolean test(Animal a);
}

class CheckIfHopper implements CheckTrait {
    public boolean test(Animal a) {
        return a.canHop();
    }
}

class CheckIfSwimmer implements CheckTrait {
    public boolean test(Animal a) {
        return a.canSwim();
    }
}

class TraditionalSearch {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        print(animals, new CheckIfHopper());
        print(animals, new CheckIfSwimmer());
    }
    private static void print(List<Animal> animals, CheckTrait checker) {
        for(Animal animal : animals) {
            if (checker.test(animal))
                System.out.println(animal+" ");
        }
        System.out.println();
    }
}
