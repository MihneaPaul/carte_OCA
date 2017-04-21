package desert;

/**
 * Created by Mihnea on 20.04.2017.
 */
public class Marsupial {
    String name;
    protected  int tailLength=4;

    public String getName() {
        return name;
    }

    public boolean isBiped() {
        return false;
    }
    public void getMarsupialDescription() {
        System.out.println("Marsupials walks on two legs: "+isBiped());
        System.out.println("Marsupials have a tail with length: "+tailLength);
    }
}

class Kangaroo extends Marsupial {
    protected int tailLength = 7;
    public Kangaroo(String name) {
        this.name = name;
    }
    public boolean isBiped() {
        return true;
    }
    public void getKangarooDescription() {
        System.out.println("Kangaroo "+getName()+" hops on two legs: "+this.isBiped());
        System.out.println("Also, Kangaroos have a tail length of "+tailLength+" whereas marsupials only "+super.tailLength);
    }

    public static void main(String[] args) {
        Kangaroo joey = new Kangaroo("Joey");
        Marsupial alex = new Marsupial();
        joey.getMarsupialDescription();
        joey.getKangarooDescription();
        alex.getMarsupialDescription();


    }
}
