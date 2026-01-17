public class Mountain {
    public static void main(String[] args) {
        int arr[] = {0,1,0};
        System.err.println(peakIndexInMountainArray(arr));
    }
    static public int peakIndexInMountainArray(int[] arr) {
       int start = 0;
       int end = arr.length - 1;

       while (start < end) {
        int mid = start + (end - start) / 2;
        if(arr[mid] > arr[mid+1])
        {
            //you are in decresing part of array
            //this may be the ans 
            //this is why end!= mid -1
            end = mid;
        }
        else 
        {
            //you are in asc part of array f
            start = mid + 1; //because we know that mid+1 element > mid element
        }
       }
       return start;
    }
}
