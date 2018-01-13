package main

func reverseString(s string) string {
    length := len(s)
    result := make([]byte, length)
    for index, _ := range s {
        result[index] = s[length-index-1]
    }
    return string(result)
}
