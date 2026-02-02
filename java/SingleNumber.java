public class SingleNumber {
    public static void main(String[] args) {
        for(int element = 0; element<3; element++)
        {
            for(int duplicate = 0; duplicate <= 3; duplicate++)
              if(duplicate != element)
                if (nums[element] == nums[duplicate])
                   return new int[]{-1};
        }
        return new int[]{duplicate};
    }
}
