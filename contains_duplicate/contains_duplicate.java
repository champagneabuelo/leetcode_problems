import java.util.*;

class Solution {
    private static Set<Integer> duplicateList(int[] nums) {
        Set<Integer> seen = new HashSet<Integer>();
        Set<Integer> seen1 = new HashSet<Integer>();
        for (int n : nums) {
            if (seen.contains(n)) {
                seen1.add(n);
            } else {
                seen.add(n);
            }
        }
        return seen1;
    }
    
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = duplicateList(nums);
        if (set.size() > 0) {
            return true;
        } else {
            return false; 
        }
    }
}
