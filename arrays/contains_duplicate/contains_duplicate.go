package main

func containsDuplicate(nums []int) bool {
    nums_len := len(nums)
    for currindex, currvalue := range nums {
        for i := currindex+1; i < nums_len; i++ {
            if nums[i] == currvalue {
                return true
            }
        }
    }
    return false
}
