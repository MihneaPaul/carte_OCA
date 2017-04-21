package reptileZoo;

import desert.Marsupial;

/**
 * Created by Mihnea on 20.04.2017.
 */
public class Reptile {
    public String getName() {
        return "Reptile";
    }
}
class Alligator extends Reptile {
    @Override
    public String getName() {
        return "Alligator";
    }
}
class Crocodile extends Reptile {
    @Override
    public String getName() {
        return "Crocodile";
    }
}
class ZooWorker {
    public static void feed(Reptile reptile) {
        System.out.println("Feeding "+reptile.getName());
    }

    public static void main(String[] args) {
        feed(new Alligator());
        feed(new Crocodile());
        feed(new Reptile());
    }
}

class Mammal {
    public Mammal(int age){
        System.out.println("Mammal");
    }
    public Mammal(){}
}
class Platypus extends Mammal {
    public Platypus() {

        System.out.println("Platypus");
    }

    public static void main(String[] args) {
        new Mammal(57);
        new Platypus();
    }
}
