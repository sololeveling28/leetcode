class Solution {
public String longestPalindrome(String s) {
if (s == null || s.length() < 1) return "";


    String result = "";

    for (int i = 0; i < s.length(); i++) {
        String odd = check(i, i, s);       
        String even = check(i, i + 1, s);  

        if (odd.length() > result.length()) {
            result = odd;
        }
        if (even.length() > result.length()) {
            result = even;
        }
    }

    return result;
}

public String check(int l, int r, String s) {
    while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
        l--;
        r++;
    }
    return s.substring(l + 1, r);
}


}
