public class TwoSum {
    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target = 13;
        int[] result = twoSum(nums, target);
        System.out.println("Indexes: " + result[0] + ", " + result[1]);
    }
        static int[] twoSum(int[] nums, int target)
        {
        for(int firstInd = 0; firstInd < nums.length; firstInd++)
         {
            for(int secInd = firstInd + 1; secInd < nums.length; secInd++)
            {
                    if(nums[firstInd] + nums[secInd] == target)
                    {
                       return new int[]{firstInd, secInd};
                    }
                }
            }
            return new int[]{-1, -1};
         
        }
}

