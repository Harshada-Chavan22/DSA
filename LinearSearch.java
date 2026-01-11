public class LinearSearch 
{   //Search in range of 1 till 4
    public static void main(String[] args) 
    {
        int [] nums = {18, 12, -7, 3, 14, 28};
        int target = 14;
        int ans = linearS(nums, target, 1,4);
        System.out.println(ans);
    }
    static int linearS(int [] arr, int target, int start, int end)
    {
        if(arr.length == 0)
        {
            return -1;
        }
        //run a for loop
        for (int i = start; i <= end; i++) 
        {
            //check for element at every index if it is = target
            int element = arr[i];
            if(element == target)
            {
                return i;
            }
        }
        return -1;
    }
}
