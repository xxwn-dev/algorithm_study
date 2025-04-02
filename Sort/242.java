class Solution {
    public boolean isAnagram(String s, String t) {
        //#1
        // char[] sArr = s.toCharArray();
        // char[] tArr = t.toCharArray();
        // int cnt = 0;
        // for(int i=0; i<sArr.length; i++){
        //     for(int j=0; j<tArr.length; j++){
        //         if(sArr[i] ==tArr[j]){
        //             cnt++;
        //             break;
        //         }
        //     }
        // }
        // if(cnt == sArr.length){
        //     return true;
        // } else {
        //     return false;
        // }

        if(s.length() != t.length()){
            return false;
        }

        int[] charCnt = new int[26];
        for(int i=0; i<s.length(); i++){
            charCnt[(s.charAt(i) - 'a')]++;
            charCnt[(t.charAt(i) - 'a')]--;
        }

        for(int cnt : charCnt){
            if(cnt != 0){
                return false;
            }
        }
        return true;
    }
}
