import java.util.*;
import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder tempString = new StringBuilder();
        for (int n : digits) {
            tempString.append(n);
        }
        
        BigInteger convertedBig = new BigInteger(tempString.toString());
        BigInteger one = new BigInteger("1");
        BigInteger plusOne = convertedBig.add(one);
        
        String convertedString = plusOne.toString();
        System.out.println(convertedString);
        int stringLength = convertedString.length();
        int[] result = new int[stringLength];
        for (int i = 0; i < stringLength; i++) {
            result[i] = convertedString.charAt(i) - '0';
        }
        
        return result;
    }
}
