package gorilla;

/**
 * Created by Mihnea on 19.04.2017.
 */
public class Gorilla {
    public static int count;
    public static void addGorila() {
        count++;
    }
    public void babyGorilla() {
        addGorila();
        babyGorilla();
    }
    public static void announceBabiesToEveryone() {
        addGorila();
//        babyGorrila(); // DOES NOT COMPILE
        // CANNOT CALL NON-STATIC METHOD IN STATIC METHOD
    }
    public int total;
//    public static average = total/count; STATIC VARIABLE CANNOT USE INSTANCE VARIABLE
}
