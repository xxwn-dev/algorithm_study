import java.util.Comparator;
class Solution {
    public String largestNumber(int[] nums) {
        // #1 방법
        // String[] convertNums = new String[nums.length];
        // for(int i=0; i<nums.length; i++){
        //     convertNums[i] = String.valueOf(nums[i]);
        // }
        // Arrays.sort(convertNums, new Comparator<String>(){
        //     @Override
        //     public int compare(String s1, String s2){//두개의 객체 비교
        //         String order1 = s1 + s2;
        //         String order2 = s2 + s1;
        //         return order2.compareTo(order1);//현재 객체와 다른 객체 비교 --> 내림차순
        //     }
        // });
        // if(convertNums[0].equals("0")){
        //     return "0";
        // }
        // StringBuilder sb = new StringBuilder();
        // for(String str : convertNums){
        //     sb.append(str);
        // }
        // return sb.toString();
        // #2 방법
        String[] convertNums = Arrays.stream(nums)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        Arrays.sort(convertNums, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));

        if (convertNums[0].equals("0")) {
            return "0";
        }

        return Arrays.stream(convertNums).collect(Collectors.joining());        
    }
}
