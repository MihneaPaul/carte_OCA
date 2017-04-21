package pond.inland;
import pond.shore.Bird;
/**
 * Created by Mihnea on 19.04.2017.
 */
public class BirdWatcherFromAfar { // different package AND IT DOES NOT INHERIT FROM BIRD
    public void watchBird() {
        Bird bird = new Bird();
//        bird.floatInWater(); // DOES NOT COMPILE
//        System.out.println(bird.text); // DOES NOT COMPILE
    }
}
