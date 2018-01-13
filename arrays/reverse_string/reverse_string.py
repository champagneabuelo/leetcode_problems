class Solution(object):
    def reverse_string(self, nums, start, finish):
        front = start 
        back = finish
        while front < back:
            nums[front] = nums[front] ^ nums[back]
            print nums[front]
            nums[back] = nums[front] ^ nums[back]
            print nums[back]
            nums[front] = nums[front] ^ nums[back]
            print nums[front]
            front += 1
            back -= 1
        return 

    def rotate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: void Do not return anything, modify nums in-place instead.
        """
        length = len(nums)
        finish = k % length
        Solution().reverse_string(nums, 0, length-1)
        Solution().reverse_string(nums, 0, finish-1)
        Solution().reverse_string(nums, finish, length-1)
        return


test_array = [1,2,3,4,5,6,7]
ret = Solution().rotate(test_array, 3)
print ret
print test_array
