package main

func plusOne(digits []int) []int {
    length := len(digits)

    for length != 0 {
        length--
        digits[length] += 1
        if digits[length] > 9 {
            digits[length] = 0
        } else {
            return digits
        }
    }

    newLength := len(digits)+1
    result := make([]int, newLength)
    result[0] = 1
    for i := 1; i<newLength; i++ {
        result[i] = digits[i-1]
    }

    return result
}
