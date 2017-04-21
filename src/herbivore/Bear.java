package herbivore;

/**
 * Created by Mihnea on 20.04.2017.
 */
interface Herbivore {
    public static final int NBR_OF_PLANTS=4;
    public void eatPlants();

    public void eatPlants(int quantity);

}
interface Omnivore {
    public void eatPlants(); // must have same return type as the other eatPlants();
    public void eatMeat();
}
public class Bear implements Herbivore, Omnivore {
    @Override
    public void eatMeat() {
        System.out.println("Eating meat.");
    }

    @Override
    public void eatPlants() {
        System.out.println("Eating plants.");
    }

    @Override
    public void eatPlants(int quantity) {
        System.out.println("Eating "+quantity+" plants.");
    }

    public static void main(String[] args) {
        Bear bear = new Bear();
        Bear bear2 = new Bear();
        bear.eatMeat();
        bear.eatPlants();
        bear2.eatPlants(8);
    }
}

interface Walk {
    public default int getSpeed() {
        return 5;
    }
}
interface Run {
    public default int getSpeed() {
        return 10;
    }
}

class Cat implements Walk, Run {
    public int getSpeed() {
        return 7;
    }
    public static void main(String[] args) {
        System.out.println(new Cat().getSpeed());
    }
}
