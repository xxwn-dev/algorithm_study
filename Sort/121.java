class Solution {
    public int maxProfit(int[] prices) {
        //투포인터
        //가장 낮은 구매 가격을 찾으면서 동시에 그 이후의 가장 높은 판매 가격을 찾아야 한다.
        //두번째 포인터가 배열 끝에 올 필요가 xx
        int left = 0;
        int right = 1;
        int maxGap = 0;
        while(right < prices.length){
            int gap = prices[right] - prices[left];
            if(prices[left] < prices[right]){
                maxGap = Math.max(maxGap, gap);
            } else {
                /* 현재 right위치의 가격이 더 낮은 구매 시점이 될 수 있음 left 포인터를 right위치로 이동 */
                left = right;
            }
            right++;
        }
        return maxGap;
        
    }
}
