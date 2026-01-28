import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        //fun(1,35,76,90,4,7,9);
        multiple(2, 3, "harshu", "rahul", "mohini");
    }
    static void multiple(int a, int b, String ...v)
    {
        System.out.println(Arrays.toString(v));
    }
    static void fun(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }
}
