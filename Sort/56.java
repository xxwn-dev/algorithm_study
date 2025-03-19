/**
 * 56.Merge Intervals
 */
class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals == null || intervals.length <= 1){
            return intervals;
        }

        List<int[]> merged = new ArrayList<>();
        int[] currentInterval = intervals[0];//이중배열의 첫번째 배열
        merged.add(currentInterval);//0번째 배열을 넣고 시작

        for(int i = 1; i < intervals.length; i++){
            int currentEnd = currentInterval[1];//첫번째 배열의 끝자리
            int nextStart = intervals[i][0];//두번째배열의 첫번째값
            int nextEnd = intervals[i][1]; //두번째 배열의 두번째값

            if(currentEnd >= nextStart){
                currentInterval[1] = Math.max(currentEnd, nextEnd);//둘 중 큰 값으로 끝자리를 바꿔넣고
            } else {
                currentInterval = intervals[i];
                merged.add(currentInterval);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
