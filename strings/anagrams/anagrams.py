class Solution(object):
    def createDict(self, s):
        returnDict = dict()
        for char in s:
            if char in returnDict:
                returnDict[char] += 1
            else:
                returnDict[char] = 1
        return returnDict
    
    def anagramMatch(self, s, t):
        for char, count in s.items():
            if char not in t:
                return False
            elif t[char] != count:
                return False
        return True
    
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        sMap = Solution().createDict(s)
        tMap = Solution().createDict(t)
        
        if len(sMap) >= len(tMap):
            return Solution().anagramMatch(sMap, tMap)
        return Solution().anagramMatch(tMap, sMap)
        
