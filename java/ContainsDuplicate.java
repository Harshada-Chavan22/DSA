public class ContainsDuplicate {
    public static void main(String[] args) {
        int [] nums = {1,2,3,1};
        boolean result = containsDuplicate(nums);
        System.out.println(result);
    }
        static boolean containsDuplicate(int[] nums)
        {
        for(int element = 0; element<3; element++)
        {
            for(int duplicate = 0; duplicate <= 3; duplicate++)
              if(duplicate != element)
                if (nums[element] == nums[duplicate])
                   return true;
        }
        return false;
    }
    
    
}
