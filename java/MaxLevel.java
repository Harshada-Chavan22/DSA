public class MaxLevel {
    public static void main(String[] args) {
        int n = 15;
    int ans = maxLevel(n);
    System.out.println(ans);
    }

    static int maxLevel(int n)
    {
        int level = 0;
        while (n >= level + 1) 
        {
           level++;
           n = n - level; 
        }
        return level;
    }
}

