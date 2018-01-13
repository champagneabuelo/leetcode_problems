import java.util.*;

class Solution {
    public int firstUniqChar(String s) {
        int length = s.length();
        Map<Character, Integer> occurences = new HashMap<Character, Integer>();
        // count occurences of each character in the string
        for (int i = 0; i < length; i++) {
            char current = s.charAt(i);
            if (occurences.get(current) == null) {
                occurences.put(current, 1);
            } else {
                int incrementValue = occurences.get(current) + 1;
                occurences.put(current, incrementValue);
            }
        }
        
        System.out.println(occurences);
        // iterate through map, if char's occurence is == 1 and is less than the current index, set the return value as that index
        // if that value isnt found, return -1
        boolean foundUnique = false;
        int returnVal = length-1;
        for (Map.Entry<Character, Integer> entry : occurences.entrySet()) { 
            int entryValue = entry.getValue();
            int entryIndex = s.indexOf(entry.getKey());
            if ((entryValue == 1) && (entryIndex <= returnVal)) {
                foundUnique = true;
                returnVal = entryIndex;
            }
        }
        
        if (foundUnique) {
            return returnVal;
        }
        
        return -1;
    }
}
