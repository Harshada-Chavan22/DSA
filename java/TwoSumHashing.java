import java.util.Arrays;

public class TwoSumHashing {
    public static void main(String[] args) {
        int [] arr = {1, 3, 5, 2, 10, 7};
        int target = 7;
        int[] result = twoSum(arr, target);
        System.out.println("Indexes: " + result[0] + ", " + result[1]);
    }
        static int[] twoSum(int[] arr, int target)
        {
            int [] indexOf = new int[100];
            Arrays.fill(indexOf, -1);
        for (int index = 0; index < arr.length; index++) 
        {
            indexOf[arr[index]] = index;
        }
        for(int firstInd = 0 ; firstInd < arr.length; firstInd++)
        {
            int secVal = target - arr[firstInd];
            if(indexOf[secVal] == -1  )
            {
                continue;
            }
            if(firstInd == indexOf[secVal])
                continue;
            return new int[]{firstInd, indexOf[secVal]};
        }
        return new int[]{-1,-1};
        }
    
}
