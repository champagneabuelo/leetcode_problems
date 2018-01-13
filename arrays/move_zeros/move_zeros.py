class Solution(object):
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: void Do not return anything, modify nums in-place instead.
        """
        length = len(nums)
        i = 0
        j = 1
        while (j < length):
            while (i < length-1 and nums[i] != 0):
                i += 1
                if (i == j):
                    j += 1
            if (i == length-1):
                break
            swapValue = nums[i]
            iterValue = nums[j]
            if (swapValue == 0) and (iterValue != 0):
                nums[i] = iterValue
                nums[j] = swapValue
                i += 1
            j += 1 
