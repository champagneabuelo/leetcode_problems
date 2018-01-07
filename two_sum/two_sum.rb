# @param {Integer[]} nums
# @param {Integer} target
# @return {Integer[]}
def two_sum(nums, target)
    lookup = Hash.new
    returns = Array.new
    nums.each_with_index { |currValue, currIndex|
        searchValue = target - currValue
        if lookup.key?(searchValue) 
            returns << lookup[searchValue]
            returns << currIndex
            break
        else 
            lookup[currValue] = currIndex
        end
    }
    returns
end
