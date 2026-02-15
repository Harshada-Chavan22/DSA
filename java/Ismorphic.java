import java.util.HashMap;
public class Ismorphic {
    public static void main(String[] args) {
        String s = "paper";
        String t = "title";
        boolean ismorphic = isIsomorphic(s, t);
        System.out.println(ismorphic);
    }
    static boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length())
            return false;

        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // Agar pehle se mapped hai
            if (map.containsKey(c1)) {

                // Mapping same nahi hai
                if (map.get(c1) != c2)
                    return false;

            } else {

                // Agar c2 already kisi aur se mapped hai
                if (map.containsValue(c2))
                    return false;

                map.put(c1, c2);
            }
        }

        return true;
    }
}
