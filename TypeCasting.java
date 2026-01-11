import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        // int num = (int)(34.56);
        // System.out.println(num);
         
        //automatic type promotion in expressions
        // int a = 257;
        // byte b = (byte)(a); //257 % 256 = 1
        // System.out.println(b);

        // byte a = 40;
        // byte b = 50;
        // byte c = 100;
        // int d = (a*b)/c;
        // System.out.println(d); // 20 will be printed
         
        // int number = 'A';
        // System.out.println(number); //ASCII value of A

        // byte b = 42;
        // char c = 'a';
        // short s = 1024;
        // int i = 50000;
        // float f = 5.67f;
        // double d = 0.1234;
        // double result = (f*b) + (i/c) - (d-s);
        // System.out.println((f*b) + " " + (i/c) + " " + (d-s));
        // System.out.println(result);

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter temp in C:");
        float tempC = in.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        System.out.println(tempF);

    }
}
