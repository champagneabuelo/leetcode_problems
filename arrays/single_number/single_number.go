package main

func findSingleNumber(value int, index int, nums []int, f chan bool, n chan int) {
    for ind, val := range nums {
        if index == ind {
            continue
        } else if value == val {
            f <- false
            return
        }
    }
    f <- true
    n <- value
}


func singleNumber(nums []int) int {
    f := make(chan bool)
    n := make(chan int)
    singlenumber := 0

    for index, value := range nums {
        go findSingleNumber(value, index, nums, f, n)

        found := <-f
        if found {
            singlenumber = <-n
            break
        }
    }

    return singlenumber
}
