class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if( nums1.length == 0 || nums2.length == 0 || nums1 == null || nums2 == null){
            return new int[] {};
        }
        Set<Integer> set1 = new HashSet<>();
        //IntStream.of(nums1).forEach(set1::add);
        
        for(int n : nums1){
            set1.add(n);
        }
        
        Set<Integer> set2 = new HashSet<>();
        //IntStream.of(nums2).forEach(set2::add);

        for(int n : nums2){
            if(set1.contains(n)){
                set2.add(n);
            }
        }

        //set1.retainAll(set2);//순서 바뀌어도 값은 같음

        // int[] intersectionArr = new int[set1.size()];
        int[] intersectionArr = new int[set2.size()];
        int idx = 0;
        for(int num : set2){
            intersectionArr[idx++] = num;
        }

        return intersectionArr;
    }
}
