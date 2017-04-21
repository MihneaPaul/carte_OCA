/**
 * Created by Mihnea on 19.04.2017.
 */
public class Rabbit {
    String name;
    int age;
    String color;
    public Rabbit(String color) {
//        this.color = color;
        this(color,5);
    }
    public Rabbit(String color, int age) {
//        this.color = color;
//        this.age = age;
        this(color,age,"Vannilla");
    }
    public Rabbit(String color, int age, String name) {
        this.color=color;
        this.age=age;
        this.name=name;
    }
    public void print() {
        System.out.println("Rabbit's name is "+name+", his color is "+color+" and he is "+age+ " years old.");
    }

    public static void main(String[] args) {
        Rabbit rabbit1 = new Rabbit("blue");
        Rabbit rabbit2 = new Rabbit("yellow",8);
        Rabbit rabbit3 = new Rabbit("white", 2, "Android");
        rabbit1.print();
        rabbit2.print();
        rabbit3.print();
    }

}
