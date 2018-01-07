# @param {Integer[]} nums
# @return {Void} Do not return anything, modify nums in-place instead.
def move_zeroes(nums)
    length = nums.length
    i = 0
    j = 1
    while (j < length)
        if (i < length-1 and nums[i] != 0) 
            i += 1
            if (i == j) 
                j += 1
            end
        end
        if (i == length-1)
           break 
        end
        swapValue = nums[i]
        iterValue = nums[j]
        if (swapValue == 0 && iterValue != 0) 
            nums[i] = iterValue
            nums[j] = swapValue
            i += 1
        end
        j += 1
    end
end
