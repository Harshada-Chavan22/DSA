import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String str = "Harshu";
        char target = 'u';
        System.out.println(search(str, target));
        System.out.println(Arrays.toString(str.toCharArray()));
    }
    static boolean search(String str, char target)
    {   //function or method
        if(str.length() == 0)
        {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i))
            {
                return true;
            }
        }
        return false;  
    }
}
