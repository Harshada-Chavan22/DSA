public class UniqueChar {
    public static void main(String[] args) {
        String s = "leetcode";
        int index = firstUniqChar(s);
        System.out.println(index);
    }
    static int firstUniqChar(String s) {

    for (int firstChar = 0; firstChar < s.length(); firstChar++) {
        boolean equalPre = false;

        for (int secChar = 0; secChar < s.length(); secChar++) {
            if (firstChar != secChar &&
                s.charAt(firstChar) == s.charAt(secChar)) {

                equalPre = true;
                break; // ✅ break only when duplicate found
            }
        }

        if (equalPre == false) {
            return firstChar;
        }
    }

    return -1; // ✅ AFTER checking all characters
}
}
