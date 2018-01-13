class Solution {
    public String reverseString(String s) {
        byte[] sByteArray = s.getBytes();
        int length = sByteArray.length;
        byte[] result = new byte[length];
        for (int i = 0; i < length; i++) {
            result[i] = sByteArray[length-i-1];
        }
        return new String(result);
    }
}
