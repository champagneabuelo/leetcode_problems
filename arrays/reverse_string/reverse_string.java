class Solution {
    private static void reverseString(int[] nums, int start, int finish) {
        int front = start; 
        int back = finish; 
        while (front < back) {
            nums[front] = nums[front] ^ nums[back];
            nums[back] = nums[front] ^ nums[back];
            nums[front] = nums[front] ^ nums[back];
            front += 1; 
            back -= 1; 
        }
    }
    
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        int finish = k % length;
        reverseString(nums, 0, length-1);
        reverseString(nums, 0, finish-1);
        reverseString(nums, finish, length-1);
    }
}
