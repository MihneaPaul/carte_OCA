package pond.goose;
import pond.shore.Bird;

/**
 * Created by Mihnea on 19.04.2017.
 */
public class Gosling extends Bird { // has access to any protected or public members of the parent class
    public void swim() {
        Gosling gosling = new Gosling();
        gosling.floatinWater();
        floatinWater(); // calling protected member
        System.out.println(text); // calling protected member
        Bird bird = new Bird(); // WE CAN ONLY REFER TO GOSLING REFERENCE
        Bird other = new Gosling();
//        other.floatInWater(); // AGAIN WONT COMPILE, the object is stored in a Bird reference
//        bird.floatInWater(); // DOES NOT COMPILE
    }
}