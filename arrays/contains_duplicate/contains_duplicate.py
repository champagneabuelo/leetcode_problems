class Solution(object):
    def duplicateList(self, nums):
        seen = set()
        seen2 = set()
        seen_add = seen.add
        seen2_add = seen2.add
        for item in nums:
            if item in seen:
                seen2_add(item)
            else:
                seen_add(item)
        return list(seen2)
    
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        nums_set = Solution().duplicateList(nums)
        if len(nums_set) > 0:
            return True
        else:
            return False
