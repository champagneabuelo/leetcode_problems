import java.util.*;

class Solution {
    private static Map<Character, Integer> createMap(String s) {
        Map<Character, Integer> returnMap = new HashMap<Character, Integer>();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char current = s.charAt(i);
            if (returnMap.get(current) == null) {
                returnMap.put(current, 1);
            } else {
                int incrementValue = returnMap.get(current) + 1;
                returnMap.put(current, incrementValue);
            }
        }
        return returnMap;
    }
    
    private static boolean anagramMatch(Map<Character, Integer> sMap, Map<Character, Integer> tMap) {
        for (Map.Entry<Character, Integer> entry : sMap.entrySet()) {
            int entryValue = entry.getValue();
            char entryKey = entry.getKey();
            
            if (tMap.get(entryKey) == null) {
                return false;
            } else if (tMap.get(entryKey) != entryValue) {
                return false;
            }
        }
        return true;
    }
    
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sMap = createMap(s);
        Map<Character, Integer> tMap = createMap(t);
        
        if (sMap.size() >= tMap.size()) {
            return anagramMatch(sMap, tMap);
        }
        return anagramMatch(tMap, sMap);
    }
}
