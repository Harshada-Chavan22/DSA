public class BinarySearching {
    public static void main(String[] args) {
        int [] arr = {2,3,5,9,14,16,18};
        int target = 14;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    static int binarySearch(int [] arr, int target)
    {
        int starting = 0;
        int ending = arr.length - 1;

        while (starting <= ending) 
        {
           int halfPoint = starting + ending / 2;

           if (arr[halfPoint] < target) 
           {
            starting = halfPoint + 1;
           }
           else if(arr[halfPoint] < target)
           {
            ending = halfPoint - 1;
           }
           else
            return halfPoint;
        }
        return arr[ending];
    }
}
