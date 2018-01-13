import java.util.*;

class Solution {
    public int singleNumber(int[] nums) {
        int numslength = nums.length;
        int currvalue = 0;
        outer: for (int i = 0; i < numslength; i++) {
            int currindex = i;
            currvalue = nums[i];
            for (int j = 0; j < numslength; j++) {
                if (j == currindex) {
                    continue;
                } else if (nums[j] == currvalue) {
                    break;
                } else if (j == numslength-1) {
                    break outer;
                }
            }
        }
        return currvalue;
    }
}
