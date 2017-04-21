package chapter6;

import java.util.ArrayList;

/**
 * Created by Mihnea on 20.04.2017.
 */
public class Animal {
    private int age;
    private String name;
    public Animal() {
    }

    public Animal(int age) {
        super();
        this.age = age;
    }
    public Animal(int age, String name){
        super();
        this.age = age;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Lion extends Animal {
    private void roar() {
        System.out.println("The "+getAge()+" years old Lion says: Roar!");
    }

    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.setAge(5);
        lion.roar();
    }
}

class Zebra extends Animal {
    public Zebra(int age) {
        super(age, "Android Zebra");
    }
    public Zebra() {
        this(4); // new Zebra() -> seteaza age default 4 si numele default "Android Zebra" de la constructorul de mai sus
        // daca era super(4), facea call la constructorul de la Animal care nu are default name ci doar age.
    }
    public Zebra(int age, String name){
        super(age, name);
    }



    public void noise() {
        if (getAge() > 2) {
            System.out.println("The " + getAge() + " years old Zebra says: Hello!");
            System.out.println("My name is " + getName());
        } else {
            System.out.println("Well Hello there, I'm " + getAge() + " years old.");
            System.out.println("My name is " + getName());

        }
    }

    public static void main(String[] args) {
        Zebra zebra = new Zebra();
        Zebra zebra2 = new Zebra(2);
        Zebra zebra3 = new Zebra(7,"xxZebraxx");
        zebra.noise();
        zebra2.noise();
        zebra3.noise();
    }
}
 class Elephant extends Animal {
    public Elephant() {
        super(10, "Cosmin");
    }
 }

abstract class Lol {

    public abstract String method();

    public String getName(){
        return "Lol";
    }
}
class Rofl extends Lol {
    String name;
    public String method(){
        System.out.println("I'm laughing");
        return null;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public static void main(String[] args) {
        Lol lol = new Rofl();
        Rofl rofl = new Rofl();
        rofl.setName("Kek");
        lol.method();
        System.out.println(lol.getName());
        System.out.println(rofl.getName());
    }
}
