import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        // int ans = sum();
        // System.out.println(ans);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.next();
        String personalised = myGreet(name);
        System.out.println(personalised);
    }
    static String myGreet(String name)
    {
        String msg = "Hello" +" " +name;
        return msg;
    }
    // static int sum()
    // {
    //     Scanner in = new Scanner(System.in);
    //     System.out.println("Enter no 1:");
    //     int num1 = in.nextInt();
    //     System.out.println("Enter no 2:");
    //     int num2 = in.nextInt();
    //     int sum = num1 + num2;
    //     return sum;
    // }
}
