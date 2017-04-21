package interfaces;

/**
 * Created by Mihnea on 21.04.2017.
 */
interface C {
    void meth1();
    void meth2();
}
interface D extends C {
    void meth3();
}
class MyClass implements D {
    @Override
    public void meth1() {
        System.out.println("1st method.");
    }

    @Override
    public void meth2() {
        System.out.println("2nd method.");
    }

    @Override
    public void meth3() {
        System.out.println("3rd method.");
    }
}
public class IFExtend {
    public static void main(String[] args) {
        MyClass ob = new MyClass();
        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}
