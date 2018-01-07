package main

func reverseString(nums []int, start int, finish int) {
    front := start
    back := finish
    for front < back {
        nums[front] = nums[front] ^ nums[back]
        nums[back] = nums[front] ^ nums[back]
        nums[front] = nums[front] ^ nums[back]
        front += 1
        back -= 1
    }
}

func rotate(nums []int, k int)  {
    length := len(nums)
    finish := k % length
    reverseString(nums, 0, length-1)
    reverseString(nums, 0, finish-1)
    reverseString(nums, finish, length-1)
}
