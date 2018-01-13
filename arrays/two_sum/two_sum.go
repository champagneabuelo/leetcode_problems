package main

func twoSum(nums []int, target int) []int {
    result := make([]int, 2)
    lookup := make(map[int]int)
    for currIndex, currValue := range nums {
        searchValue := target - currValue
        if val, exists := lookup[searchValue]; exists {
            result[0] = val
            result[1] = currIndex
            break
        }
        lookup[currValue] = currIndex
    }
    return result
}
