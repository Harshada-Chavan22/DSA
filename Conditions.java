import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(a>b && a>c)
        {
            System.out.println(a + "is largest");
        }
        else if(b>a && b>c){
            System.out.println(b + "is largest");

        }
        else{
            System.out.println(c + " " + "is largest");
        }
        // int salary = 25400;
        // if(salary>10000)
        // {
        //     salary = salary + 2000;
        // }
        // else
        // {
        //     salary = salary + 1000;
        // }
        // System.out.println(salary);
        // for(int i=1; i<=n; i++)
        // {
        //     System.out.println(i);
        // }
        // int i = 1;
        // while (i<=5) {
        //     System.out.println(i);
        //     i++;
        // }
        // do{
        //     System.out.println(i);
        //     i++;
        // } while(i<=5);
    }
}
