class Solution {
    public int trap(int[] height) {
        /**투포인터
         * 시작점과 끝에 두개의 포인터를 시작한다
         * 두 포인터가 만날 때까지 반복
         * 각 단계에서 현재 (왼쪽)과 오른쪽의 값 중 작은 값을 기준으로 잡는다
         * 현재 높이가 왼쪽 또는 오늘쪽 최대 높이보다 낮을때
         * 작은 쪽 포인터를 안쪽으로 이동 최대 높이를 갱신
         */

         if(height == null || height.length == 0){
            return 0;
         }

         int left = 0;
         int right = height.length-1;
         int leftMax = 0;
         int rightMax = 0;
         int totalWater = 0;

         while(left < right){
            //왼쪽 값이 오른쪽 값보다 작을 경우
            if(height[left] < height[right]){
                //현재 왼쪽 값이 leftMax보다 크거나 같을 경우 leftMax값 갱신
                if(height[left] >= leftMax){
                    leftMax = height[left];
                } else {
                    totalWater += leftMax - height[left];
                }
                left++;
            } else {
                if(height[right] >= rightMax){
                    rightMax = height[right];
                } else {
                    totalWater += rightMax - height[right];
                }
                right--;
            }

         }
         return totalWater;
    }
}
