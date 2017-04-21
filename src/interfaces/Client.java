package interfaces;


/**
 * Created by Mihnea on 21.04.2017.
 */
interface Callback {
    void callback(int param);
}
public class Client implements Callback {
    public void callback(int p) {
        System.out.println("callback called with "+p);
    }
    public void test() {
        System.out.println("This is a test.");
    }
}
class TestIFace {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);
//        c.test(); // DOES NOT COMPILE - type Callback, only has knowledge of Callback methods.
        Client d = new Client();
        d.callback(43);
        d.test(); // WILL COMPILE
    }
}
class AnotherClient implements Callback {
    @Override
    public void callback(int p) {
        System.out.println("Another version of callback.");
        System.out.println("p squared is "+(p*p));
    }
}
class TestIFace2 {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();
        c.callback(88);
        ob.callback(77);
        c=ob;
        c.callback(42);
    }
}
abstract class Incomplete implements Callback {
    int a, b;
    // This class doest not implement callback METHOD => must be declared ABSTRACT
    void show() {
        System.out.println(a+" "+b);
    }
}