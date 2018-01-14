package main

func createMap(s string) map[byte] int {
    returnMap := make(map[byte] int)
    length := len(s)
    for i := 0; i < length; i += 1 {
        currChar := s[i]
        if _, found := returnMap[currChar]; found {
            returnMap[currChar] += 1
        } else {
            returnMap[currChar] = 1
        }
    }
    return returnMap
}

func anagramMatch(s map[byte] int, t map[byte] int) bool {
    for char, count := range s {
        if _, found := t[char]; !found {
            return false
        } else if t[char] != count {
            return false
        }
    }
    return true
}

func isAnagram(s string, t string) bool {
    sMap := createMap(s)
    tMap := createMap(t)

    if len(sMap) >= len(tMap) {
        return anagramMatch(sMap, tMap)
    }
    return anagramMatch(tMap, sMap)
}
