class Solution {
    public boolean isPalindrome(String s) {
        if(s == null){
            return false;
        }
        String origin = s.toLowerCase()
         .replaceAll("[^a-z0-9]","")//소문자가 아닌 것은 빈 문자열로 대체--> 제거
         .replaceAll("\\s+","");//1이상의 공백은 빈 문자열로 대체 --> 제거
        String reversed = new StringBuilder(origin).reverse().toString();
        if(origin.equals(reversed)){
            return true;
        } else {
            return false;
        } 
    }
}
