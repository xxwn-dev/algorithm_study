class Solution {
    public int search(int[] nums, int target) {
        int rtn = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                rtn = i;
                break;
            }
        }
        return rtn;
    }
}
