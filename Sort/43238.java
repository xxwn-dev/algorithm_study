import java.util.Arrays;

class Solution {
    public long solution(int n, int[] times) {
        long minTime = 1;
        long maxVal = 0; 
        for (int t : times) {
            if (t > maxVal) {
                maxVal = t;
            }
        }
        long maxTime = maxVal * n; 
        
        long answer = maxTime; 

        while (minTime <= maxTime) {
            // 오버플로우를 방지하는 중간 값 계산
            long midTime = minTime + (maxTime - minTime) / 2; 
            //주어진 시간 동안 각 심사관이 처리 할 수 있는 사람의 수를 계산해 전체 심사관이 처리 할 수 있는 총 인원수에 합산한다
            long peopleProcessed = 0;
            for (int t : times) {
                peopleProcessed += midTime / t;
                if (peopleProcessed >= n) { 
                    break;
                }
            }
            
            if (peopleProcessed >= n) {
                answer = midTime;
                maxTime = midTime - 1;
            } else {
                minTime = midTime + 1;
            }
        }
        
        return answer;
    }
}
