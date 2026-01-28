import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    //syntax 
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);

    ArrayList<Integer> list = new ArrayList<>(10);
    //Integer = wrapper classes

    // list.add(67);
    // list.add(89);
    // list.add(90);
    // list.add(678);
    // list.add(453);
    // list.add(231);
    // list.add(67);
    // list.add(89);
    // list.add(90);
    // list.add(678);
    // list.add(453);
    // list.add(231);
    
    // System.out.println(list.contains(453));

    // System.out.println(list);
    // list.set(0,100);
    // list.remove(2);

    // System.out.println(list);
    for (int i = 0; i < 5; i++) 
    {
        list.add(in.nextInt());
    }
    System.out.println(list);
    }

}
