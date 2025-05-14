class Solution {
    private int start = 0;
    private int maxLength = 0;

    public String longestPalindrome(String s) {
        int n = s.length();
        if( n < 2 ) {
            return s;
        }

        for(int i = 0; i < n; i++) {
            expandAroudCenter(s, i, i);//홀수 길이 회문(중심: i)
            expandAroudCenter(s, i, i+1);//짝수 길이 회문(중심 i와 i+1 사이)
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
/*
시간 복잡도: 각 문자를 중심으로 최대 O(n)의 확장이 이루어질 수 있으며, 문자열의 길이는 n이므로 전체 시간 복잡도는 O(n^2)
공간 복잡도: 상수 개의 변수만을 사용하므로 공간 복잡도는 O(1)입니다.
*/
