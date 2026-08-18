public class PrintNum {
    public static void printNumber(int n)
    {
        if(n == 6)
        {
            return;
        }
        System.out.println(n);
        printNumber(n + 1);
    }
    public static void main(String[] args) {
        int n = 1;
        printNumber(n);
    }
    //sahi h bhai o chacha wastekunuhaiya!!
    //bahut stress h yrr job ka matlab bahut hi bad feel ho rha hh
    //just doing my job in my way!!
    //i am not a bad person i am just a good person who is trying to do his job in his way!!
}
