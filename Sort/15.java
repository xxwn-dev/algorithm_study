class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //투포인터
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);//o(nlogn)
        for(int i=0; i < nums.length; i++){//n --> o(n^2);
            //이전 숫자와 현재 숫자가 같다면 건너뜀
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            //정렬되어있다면 기준 숫자가 0보다 크면 나머지 두 수도 양수일테니까
            if(nums[i] > 0){
                break;
            }

            int left = i + 1;
            int right = nums.length - 1;


            while(left < right){//n
                int currentSum = nums[i] + nums[left] + nums[right];
                if(currentSum == 0){
                    answer.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while(left < right && nums[left] == nums[left+1]){
                        left++;
                    }
                    while(left < right && nums[right] == nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                } else if(currentSum < 0){
                    left++;
                } else {
                    right--;
                }
            }
        }
        return answer;
    }
}
