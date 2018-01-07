def singleNumber(nums):
    """
    :type nums: List[int]
    :rtype: int
    """
    length = len(nums)
    found = False
    singlevalue = 0
    for i, ivalue in enumerate(nums):
        if found:
            break
        else:
            currindex = i
            singlevalue = ivalue
            for j, jvalue in enumerate(nums):
                if (j == currindex):
                    continue
                elif (jvalue == singlevalue):
                    break
                elif (j == length-1):
                    found = True
                    break
    return singlevalue

#print singleNumber([1])
print singleNumber([1, 0, 1])

