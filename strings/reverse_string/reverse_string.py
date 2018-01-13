class Solution:
    def reverseString(self, s):
        """
        :type s: str
        :rtype: str
        """
        length = len(s)-1
        result = [None]*len(s)
        for c in s:
            result[length] = c
            length -= 1
        return "".join(map(str, result))
