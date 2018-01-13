class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int[] result = new int[2];
        outer: for (int i = 0; i < length; i++) {
            int currIndex = i;
            int currValue = nums[i];
            int searchValue = target - currValue;
            for (int j = 0; j < length; j++) {
                int matchingIndex = j;
                int matchingValue = nums[j];
                if (j == currIndex) {
                    continue;
                } else if (searchValue == matchingValue) {
                    result[0] = currIndex;
                    result[1] = matchingIndex;
                    break outer;
                }
            }
        }
        return result;
    }
}
