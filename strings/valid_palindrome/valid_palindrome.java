class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.replaceAll("\\p{Punct}", "");
        String newString = s1.replaceAll(" ","").toLowerCase();
        System.out.println(newString);
        int length = newString.length();
        int i = 0;
        int j = length-1;
        while (i < j) {
            if (newString.charAt(i) != newString.charAt(j)) {
                return false;
            }
            i += 1;
            j -= 1;
        }
        return true;
    }
}
