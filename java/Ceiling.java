public class Ceiling {
    
    public static void main(String[] args) {
        char [] letters = {"c","f","j"};
        char target = "a";
        char ans = nextGreatestLetter(arr, target);
        System.out.println(ans);
    }

    public char nextGreatestLetter(char[] letters, char target) 
    {
        int start = 0;
        int end = letters.length - 1;

        while(start <= end)
        {
            int mid = start + (end - start) / 2;

            if(target < letters[mid])
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
        //the reason we are using modulo is because if the target is greater than the last element of the array then we will return the first element of the array.
    }
}

