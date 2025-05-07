class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        IntStream.of(nums1).forEach(set1::add);
        Set<Integer> set2 = new HashSet<>();
        IntStream.of(nums2).forEach(set2::add);

        set1.retainAll(set2);//순서 바뀌어도 값은 같음

        int[] intersectionArr = new int[set1.size()];
        int idx = 0;
        for(int num : set1){
            intersectionArr[idx++] = num;
        }

        return intersectionArr;
    }
}
