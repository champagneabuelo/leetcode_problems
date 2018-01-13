import java.util.*;

class Solution {
    private static int[] uniqueList(int[] nums) {
        int numslength = nums.length;
        int j = 0;
        int i = 1;
        while (i < numslength) {
            if (nums[j] == nums[i]) {
                i++;
            } else {
                j++;
                nums[j] = nums[i];
                i++;
            }
        }
        
        int[] new_array = Arrays.copyOf(nums, j+1);
        return new_array;
    }
    
    public int removeDuplicates(int[] nums) {
        int[] unique = uniqueList(nums);
        return unique.length;
    }
}
