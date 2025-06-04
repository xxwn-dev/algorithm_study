class Solution {
    public int[] productExceptSelf(int[] nums) {
        //i의 왼쪽에 있는 곱 i 제외
        //int[] n = nums.length;
        int[] answer = new int[nums.length];

        //왼쪽부터 계산함
        answer[0] = 1;
        for(int i=1; i<nums.length; i++){//O(N)
            answer[i] = answer[i-1] * nums[i-1];
        } 
        //answer = [1, 1, 2, 6];
        //오른쪽계산
        int currentRightProduct = 1;
        for(int i=nums.length-1; i>=0; i--){//O(N)i=3 --> answer[3] = 6 * 1 = 6
            answer[i] = answer[i] * currentRightProduct;//answer[2] = 2 * 4 = 8
            //answer[1] = 1 * 12 = 12 answer[0]= 1* 24 = 24
            currentRightProduct = currentRightProduct * nums[i];//1* 4, 4*3, 12*2 , 1*24
        }

        return answer;

    }
}
