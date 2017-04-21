package pond.shore;

/**
 * Created by Mihnea on 19.04.2017.
 */
public class BirdWatcher {
    public void watchBird() {
        Bird bird = new Bird();
        bird.floatinWater();
        System.out.println(bird.text);
    }
}
