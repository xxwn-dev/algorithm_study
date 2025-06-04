class Solution {
    public int arrayPairSum(int[] nums) {
        
        Arrays.sort(nums);//O(NlogN)

        int maxSum = 0;
        for(int i=0; i<nums.length; i+= 2) {//O(N)
            maxSum += nums[i];
        }

        return maxSum;
    }
}
