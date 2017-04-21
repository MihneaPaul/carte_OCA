package ocean;

/**
 * Created by Mihnea on 20.04.2017.
 */
public class Fish {
    protected int size;
    private int age;

    public Fish(int age){
        this.age=age;
    }

    public int getAge() {
        return age;
    }
}

class Shark extends Fish {
    private int numberOfFins = 8;

    public Shark(int age) {
        super(age);
        this.size = 4;
    }
    public void displaySharkDetails() {
        System.out.print("Shark with age: "+getAge());
        System.out.print(" and "+size+" meters long");
        System.out.println(" with "+numberOfFins+" fins");
    }

    public static void main(String[] args) {
        Shark shark = new Shark(6);
        shark.displaySharkDetails();
    }
}
