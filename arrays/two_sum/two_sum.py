class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        length = len(nums)
        result = [None]*2
        found = False
        for currIndex, currValue in enumerate(nums):
            if (found):
                break
            searchValue = target - currValue
            for matchIndex, matchValue in enumerate(nums):
                if (matchIndex == currIndex):
                    continue
                elif (matchValue == searchValue):
                    result[0] = currIndex
                    result[1] = matchIndex
                    found = True
                    break
        return result

    def twoSum2(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        result = [None]*2
        foundVals = {}
        for currIndex, currValue in enumerate(nums):
            searchValue = target - currValue
            if searchValue in foundVals:
                result[0] = foundVals[searchValue]
                result[1] = currIndex
                break
            else:
                foundVals[currValue] = currIndex
        return result
