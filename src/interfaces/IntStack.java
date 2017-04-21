package interfaces;

/**
 * Created by Mihnea on 21.04.2017.
 */
public interface IntStack {
    void push(int item); // store an item
    int pop(); // retrieve an item
    default void clear() {
        System.out.println("clear() not implemented.");
    }
}

// An implementation of IntStack that uses fixed storage
class FixedStack implements IntStack {
    private int stck[];
    private int tos;

    // allocate and initialize stack
    FixedStack(int size) {
        stck = new int[size];
        tos=-1;
    }

    // push and item onto the stack
    public void push(int item) {
        if(tos==stck.length-1)
            System.out.println("Stack is full.");
        else stck[++tos] = item;
    }

    // pop an item from the stack
    public int pop() {
        if(tos<0) {
            System.out.println("Stack underflow.");
            return 0;
        }
        else return stck[tos--];
    }
}

class IFTest {
    public static void main(String[] args) {
        FixedStack myStack1 = new FixedStack(8);
        FixedStack myStack2 = new FixedStack(5);

        for(int i=0;i<8;i++) myStack1.push(i);
        for(int i=0;i<5;i++) myStack2.push(i);

        System.out.println("Stack in myStack1:");
        for(int i=0;i<5;i++) System.out.println(myStack1.pop());

        System.out.println("Stack in myStack12:");
        for(int i=0;i<8;i++) System.out.println(myStack2.pop());
    }
}

class DynStack implements IntStack {
    private int stck[];
    private int tos;

    DynStack(int size) {
        stck = new int[size];
        tos=-1;
    }
    public void push(int item) {
        if(tos==stck.length-1) {
            int temp[] = new int[stck.length*2];
            for(int i=0;i<stck.length;i++) temp[i]=stck[i];
            stck=temp;
            stck[++tos]=item;
        }
        else {
            stck[++tos]=item;
        }
    }
    public int pop(){
        if(tos<0) {
            System.out.println("Stack underflow.");
            return 0;
        }
        else return stck[tos--];
    }
}
class IFTest2 {
    public static void main(String[] args) {
        DynStack myStack1 = new DynStack(5);
        DynStack myStack2 = new DynStack(8);

        for(int i=0;i<12;i++) myStack1.push(i);
        for(int j=0;j<20;j++) myStack2.push(j);

        System.out.println("Stack in myStack1:");
        for(int i=0;i<12;i++) System.out.println(myStack1.pop());

        System.out.println("Stack in myStack2:");
        for(int j=0;j<20;j++) System.out.println(myStack2.pop());
    }
}
class IFTest3 {
    public static void main(String[] args) {
        IntStack mystack;
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);
        mystack=ds;

        for(int i=0;i<12;i++) mystack.push(i);

        mystack=fs;
        for(int i=0;i<8;i++) mystack.push(i);

        mystack=ds;
        System.out.println("Values in dynamic stack: ");
        for (int i=0;i<12;i++) System.out.println(mystack.pop());

        mystack=fs;
        System.out.println("Values in fixed stack: ");
        for(int i=0;i<8;i++) System.out.println(mystack.pop());
    }
}

// ABSTRACT RULES TEST

abstract class Yo {
    abstract void go();
    public void come(){
        System.out.println("Hey");
    }
}
// END OF TEST

interface MyIF1 {
    int getNumber();
    default String getString() {
        return "Default String";
    }
    static int getDefaultNumber() {
        return 77;
    }
}
class MyIFTestDrive implements MyIF1 {
    public int getNumber() {
        return 88;
    }
    public String getString() {
        return "Not so Default String";
    }
    public void afoo() {
        System.out.println(MyIF1.super.getString());
    }
    public static void main(String[] args) {
        MyIFTestDrive obj = new MyIFTestDrive();
        System.out.println(obj.getNumber());
        System.out.println(obj.getString());
        obj.afoo();
        int defNum = MyIF1.getDefaultNumber();
        System.out.println(defNum);
    }
}