class Solution {
    public void sortColors(int[] nums) {

        if(nums.length <= 1){
            return;
        }
        int mid = nums.length / 2;
        int[] left = new int[mid];
        int[] right = new int[nums.length - mid];

        for(int i=0; i<mid; i++){
            left[i] = nums[i];
        }

        for(int i=mid; i<nums.length; i++){
            right[i - mid] = nums[i];
        }
        sortColors(left);
        sortColors(right);

        merge(nums, left, right);
    }

    private void merge(int[] nums, int[] left, int[] right){
        int i=0, j=0, k=0; //i left배열 인덱스 j right배열 인덱스 k원본배열 인덱스

        while( i < left.length && j < right.length){
            if( left[i] <= right[j] ){
                nums[k++] = left[i++];
            } else {
                nums[k++] = right[j++];//[1][1][0][][][]
            }
        }

        while( i < left.length ){
            nums[k++] = left[i++];
        }
        while( j < right.length ){
            nums[k++] = right[j++];
        }
    }
}
