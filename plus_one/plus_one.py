class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        convertedLong = long(''.join(map(str,digits)))
        plusOne = convertedLong + 1
        
        convertedString = str(plusOne)
        result = [None]*len(convertedString)
        for index, value in enumerate(convertedString):
            result[index] = int(value)
        
        return result
