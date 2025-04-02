class Solution {
    public char[] reverseString(char[] s) {
        //#1
        // char[] reversed = new char[s.length];
        // for(int i=s.length-1; i>=0; i--){
        //     reversed[s.length - (i+1)] = s[i];
        // }
        // return reversed;
        //#2
        int left = 0;
        int right = s.length -1;

        while(left < right){
            char tmp = s[left];
            s[left] = s[right];//0번째 배열에 마지막 값을 넣는다
            s[right] = tmp;
            left++;
            right--;
        }
        return s;
    }
}
