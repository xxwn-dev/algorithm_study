class Solution {
    public int search(int[] nums, int target) {
        //이진탐색을 써봅시다! --> 회전된 배열이기때문에 수정된 이진탐색을 써야합니당
        //피벗 인덱스 찾고 --> 탐색 범위를 결정 --> 이진탐색
        int pivotIdx = findPivot(nums);
        int left, right;

        if(pivotIdx == 0){
            left = 0;
            right = nums.length -1;
        } else if(target >= nums[0] && target <= nums[pivotIdx-1]){
            left =0;
            right = pivotIdx -1;
        } else {
            left = pivotIdx;
            right = nums.length -1;
        }

        while(left <= right){
            int mid = left + (right -left ) /2;
            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] < target){
                left = mid +1;
            } else {
                right = mid -1;
            }
        }
        return -1;
    }
    private int findPivot(int[] nums){
        int left = 0;
        int right = nums.length -1;

        while(left <= right){
            int mid = left + (right - left) / 2;
            if(mid < right && nums[mid] > nums[mid +1]){
                return mid +1;
                //중간 값 바로 다음 값이 중간 값보다 작다면 mid +1 위치가 피벗
            }
            if(mid > left && nums[mid] < nums[mid -1]){
                return mid;
                //중간 값 바로 이전 값이 중간 값 보다 크다면 현재 위치가 피벗
            }

            //탐색 범위 조정
            if(nums[left] <= nums[mid]){
                left = mid +1;
            } else {
                right = mid -1;
            }
        }
        return 0;
    }
}
