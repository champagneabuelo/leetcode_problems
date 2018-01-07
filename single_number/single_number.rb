# @param {Integer[]} nums
# @return {Integer}
def single_number(nums)
    ret = 0
    nums.each {|n|
        ret = ret ^ n    
    }
    return ret
end
