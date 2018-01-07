class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        length = len(nums)
        i = 0
        j = 1
        while (j < length):
            if (nums[i] == nums[j]):
                nums.pop(j)
                length -= 1
            else:
                i += 1
                j += 1
        return length
