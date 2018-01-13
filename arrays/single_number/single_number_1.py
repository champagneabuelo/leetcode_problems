    """ 
    Interesting usage of XOR:
        repeat ^ repeat = 0
        0 ^ lone = lone
    """
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        value = 0 
        
        for n in nums:
            value = value ^ n
        
        return value
