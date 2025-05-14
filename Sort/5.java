class Solution {
    private int start = 0;
    private int maxLength = 0;

    public String longestPalindrome(String s) {
        int n = s.length();
        if( n < 2 ) {
            return s;
        }

        for(int i = 0; i < n; i++) {
            expandAroudCenter(s, i, i);//aba
            expandAroudCenter(s, i, i+1);//
        }
        return s.substring(start, start + maxLength);
    }

    private void expandAroudCenter(String s, int left, int right) {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            if(right - left + 1 > maxLength){
                maxLength = right - left +1;
                start = left;
            }
            left--;
            right++;
        }
    }
}
