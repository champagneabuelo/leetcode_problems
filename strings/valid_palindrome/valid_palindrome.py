import re

class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        pattern = re.compile('[^a-zA-Z]+')
        pattern1 = re.compile('[^\P{P}-]+')
        s1 = pattern.sub('', s)
        s2 = pattern1.sub('', s1)
        length = len(s2)
        i = 0
        j = length-1
        print(s2)
        while (i < j):
            if s2[i] != s2[j]:
                return False
        return True
        
