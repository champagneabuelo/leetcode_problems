# @param {Integer[]} nums
# @param {Integer} k
# @return {Void} Do not return anything, modify nums in-place instead.
def reverse_string(nums, start, finish)
    front = start
    back = finish
    while front < back 
        nums[front] = nums[front] ^ nums[back]
        nums[back] = nums[front] ^ nums[back]
        nums[front] = nums[front] ^ nums[back]
        front += 1
        back -= 1
    end
end

def rotate(nums, k)
    length = nums.length
    finish = k % length 
    reverse_string(nums, 0, length-1)
    reverse_string(nums, 0, finish-1)
    reverse_string(nums, finish, length-1)
end
