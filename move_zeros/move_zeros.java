import java.util.*;

class Solution {
    public void moveZeroes(int[] nums) {
        int length = nums.length;
        int i = 0;
        int j = 1;
        while (j < length) {
            while (i < length-1 && nums[i] != 0) {
                i++;
                if (i == j) {
                    j++;
                }
            }
            if (i == length-1) {
                break;
            }
            int swapValue = nums[i];
            int iterValue = nums[j];
            if (swapValue == 0 && iterValue != 0 ) {
                nums[i] = iterValue;
                nums[j] = swapValue;
                i++;
            }
            j++;
        }
    }
}
