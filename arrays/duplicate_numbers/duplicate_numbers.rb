# @param {Integer[]} nums
# @return {Integer}
def remove_duplicates(nums)
    uniq_nums = nums.uniq!
    if !uniq_nums.nil?
       return uniq_nums.length 
    else
        return nums.length
    end
end
