public class Maxima {
    public static void main(String[] args) {
        int[] arr = {2,5,10,15,12,11,9,7,-1};
        int target = 5;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        //int ans = -1;
        //int mid = start + (end - start) / 2;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            } 
            else if (arr[mid] > target) {
                end = mid - 1;
            }
            else {
                if( arr[mid] < arr[mid - 1] && arr[mid] < arr[mid + 1] ) 
                   start = mid + 1;
                else if( arr[mid]  arr[mid - 1] && arr[mid] > arr[mid + 1] ) 
                   end = mid - 1; 
                else
                    return arr[mid];

            }
        }
        return -1;
}
}
