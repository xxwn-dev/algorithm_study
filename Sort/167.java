class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[] { left + 1, right + 1 };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] { -1, -1 };
    }
}
/* 투포인터 전략(이진함수)
 left, right를 배열의 처음과 끝으로 초기화
 루프를 통해 두 포인터가 만날 때까지 탐색
 더한 값이 target보다 작으면 left는 오른쪽으로 이동하고, right는 왼쪽으로 이동
 return new int[] { -1, -1 }; 컴파일러 만족시키기 위한 코드 실제 실행 x
 시간 복잡도: O(n) - left와 right 포인터가 배열을 한 번 순회하면서 해답을 찾음
 공간 복잡도: O(1) - 추가적인 공간을 사용하지 않고 상수 시간의 공간만을 사용.
 */
