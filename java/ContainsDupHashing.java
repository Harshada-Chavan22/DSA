import java.util.Arrays;

public class ContainsDupHashing {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 2, 10, 7,};

        System.out.println(containsDuplicate(nums));
    }
    
    static boolean containsDuplicate(int[] nums) {

        int[] indexOf = new int[100];
        Arrays.fill(indexOf, -1);

        for (int i = 0; i < nums.length; i++) {

            // if value already seen → duplicate
            if (indexOf[nums[i]] != -1) {
                return true;
            }

            // store index (same as your two sum)
            indexOf[nums[i]] = i;
        }

        return false;
    }
}
