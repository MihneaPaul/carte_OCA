package sky;

import java.util.concurrent.BrokenBarrierException;

/**
 * Created by Mihnea on 20.04.2017.
 */
public class Bird {
    public String getName() {
        return "Unknown";
    }
    public void displayInfo() {
        System.out.println("The bird's name is: "+getName());
    }
}

class Peacock extends Bird {
    public String getName() {
        return "Peacock";
    }

    public static void main(String[] args) {
        Bird bird = new Peacock();
        Peacock peacock = new Peacock();
        bird.displayInfo();
        peacock.displayInfo();
    }
}
