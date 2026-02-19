public class Sqrt {
    public static void main(String[] args) 
    {
        int n = 10; 
        System.out.println(sqrt(n));
    }
    static int sqrt(int n)
    {
        int start = 1; 
        int end = n;
        while (start <= end) {
        int currentPoint = (start + end) / 2;
        if (currentPoint * currentPoint == n || (currentPoint * currentPoint < n && (currentPoint+1) * (currentPoint+1) > n) )
            return currentPoint; 
        else if(currentPoint * currentPoint > n) 
            end = currentPoint - 1;
        else
            start = currentPoint + 1;
    }
    return end;
    }
}
