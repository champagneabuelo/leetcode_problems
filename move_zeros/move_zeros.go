package main

func moveZeroes(nums []int)  {
    length := len(nums)
    i := 0
    j := 1
    for j < length {
        for (i < length-1) && (nums[i] != 0) {
            i++
            if (i == j) {
                j++
            }
        }
        if (i == length-1) {
            break
        }
        swapValue := nums[i]
        iterValue := nums[j]
        if (swapValue == 0) && (iterValue != 0) {
            nums[i] = iterValue
            nums[j] = swapValue
            i++
        }
        j++
    }
}
