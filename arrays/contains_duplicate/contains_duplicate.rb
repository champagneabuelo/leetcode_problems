# @param {Integer[]} nums
# @return {Boolean}

def contains_duplicate(nums)
    nums_set = Set.new()
    nums.each { |e|
        if nums_set.add?(e) == nil
            return true; 
        end
    }
    return false;
end
