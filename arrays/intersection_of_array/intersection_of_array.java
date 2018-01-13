import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> list = new ArrayList<Integer>();
        
        // create a map that counts the number of instances of nums1 elements
        for (int n : nums1) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n)+1);
            } else {
                map.put(n, 1);
            }
        }
        
        // check in map for occurrences of elements in nums2
        // - if found, decrement value by 1 and add value to list
        for (int n : nums2) {
            if (map.containsKey(n)) {
                if (map.get(n) > 1) {
                    map.put(n, map.get(n)-1);
                } else {
                    map.remove(n);
                }
                list.add(n);
            }
        }
        
        // convert ArrayList to int[]
        int length = list.size();
        int[] result = new int[length];
        int i = 0;
        while (i < length) {
            result[i] = list.get(i);
            i++;
        }
        
        return result;
    }
}
