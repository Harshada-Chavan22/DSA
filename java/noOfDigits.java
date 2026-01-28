import java.util.Scanner;

public class noOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int digit = 3;
        while (n>0) {
            int rem = n%10;
            if(rem == digit)
            {
                count++;
            }
             n = n/10;
        }
        System.out.println("No of 3's in number is:" + count);

    }
}
