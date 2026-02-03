public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3,2,3,3};

        int result = majorityElement(nums);
        System.out.println(result);
    }
    static int majorityElement(int [] nums)
    {
        for(int firstInd = 0; firstInd < nums.length; firstInd++)
         {
            int numberCount = 0;
            for(int secInd = 0; secInd < nums.length; secInd++)
            {
                if(secInd != firstInd && nums[firstInd] == nums[secInd])
                    numberCount++;
            }
            if(numberCount + 1 > nums.length / 2)
                return nums[firstInd];
         }
         return -1;
}
}
