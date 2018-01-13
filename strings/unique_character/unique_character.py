class Solution(object):
    def firstUniqChar(self, s):
        """
        :type s: str
        :rtype: int
        """
        occurences = dict()
        length = len(s)-1
        for index, value in enumerate(s):
            if value in occurences:
                occurences[value] += 1
            else:
                occurences[value] = 1
        
        foundUnique = False
        returnVal = length
        for char, count in occurences.items():
            currentIndex = s.find(char)
            if (count == 1) and (currentIndex <= returnVal):
                foundUnique = True
                returnVal = currentIndex
        if foundUnique:
            return returnVal
        
        return -1
