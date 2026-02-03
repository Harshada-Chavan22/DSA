public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        int result = singleNumber(nums);
        System.out.println(result); // prints 1
    }

    static int singleNumber(int[] nums) {

        for (int element = 0; element < nums.length; element++) {
            boolean isDuplicate = false;

            for (int duplicate = 0; duplicate < nums.length; duplicate++) {
                if (duplicate != element && nums[element] == nums[duplicate]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                return nums[element]; // ✅ FIXED
            }
        }
        return -1;
    }
}
