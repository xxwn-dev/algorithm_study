import java.util.*;
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        //1.문자열변환
        String processed = paragraph.replaceAll("[!?',;.]"," ").toLowerCase();
        System.out.println(processed);
        //2.단어 추출
        String[] words = processed.split("\\s+");

        //3.금지어 HashSet은 배열을 직접 인자로 받는 생성자가 없어서 List 객체를 새로 만들어서 넣어줘야함
        Set<String> bannedWords = new HashSet<>(Arrays.asList(banned));

        //4.각 단어 빈도수 계산 - 금지어 제외하고 비교
        Map<String, Integer> wordCounts = new HashMap<>();
        for(String word : words){
            if(!bannedWords.contains(word)){
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) +1);
            }
        }

        //5. 가장 빈번한 단어 찾기 - 키와 값을 함께 접근하기 위해 entrySet를 사용 entrySet은 모든 키-값 쌍을 Set 형태로 반환한다.
        String mostCommon = "";
        int maxCnt = 0;
        for(Map.Entry<String, Integer> entry : wordCounts.entrySet()){
            if(entry.getValue() > maxCnt){
                mostCommon = entry.getKey();
                maxCnt = entry.getValue();
            }
        }
        return mostCommon;
    }
}
