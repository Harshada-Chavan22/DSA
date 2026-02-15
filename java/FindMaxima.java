public class FindMaxima {
    public static void main(String[] args) {
        int [] arr = {2,5,10,15,12,11,9,7,-1};
        int ans = findMaxima(arr);
        System.out.println(ans);
    }

    static int findMaxima(int [] arr)
    {
        int start = 0;
        int end = arr.length-1;
        while (start < end) {
            int mid = (start+end) / 2;
            if (arr[mid] > arr[mid+1]) {
                end = mid;
                
            }
            else{
                start = mid+1;
            }
        }
        return arr[start];
    }
}
