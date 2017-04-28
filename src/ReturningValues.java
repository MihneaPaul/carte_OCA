/**
 * Created by Mihnea on 19.04.2017.
 */
public class ReturningValues {
    public static int number (int number){
        number++;
        return number;
    }
    public static void main(String... args) {
        int a[][];
        int number = 1;
        System.out.println(number(number));
        int x = number(number);
        System.out.println(x);
        int y = 1;
        int z = 3;
        swap(y,z);
    }
    public static void swap(int a, int b){
//        swap(2,3);
        int temp = a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
        System.out.println(b+" "+a);
    }
}
