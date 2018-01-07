package main

func removeIndex(nums []int, i int) {
    nums = append(nums[:i], nums[i+1:]...)
}
func removeDuplicates(nums []int) int {
    length := len(nums)
    i := 0
    j := 1
    for j < length {
        if (nums[i] == nums[j]) {
            removeIndex(nums, j)
            length -= 1
        } else {
            i += 1
            j += 1
        }
    }
    return length
}
