class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //strs를 순회 하면서 문자열 하나씩을 비교?
        //길이 부터 비교해서 둘이 일치하지 않으며 리턴한다
        //List.add()는 불리언 값을 리턴한다.
        List<List<String>> answer = new ArrayList<>();
        Map<String, List<String>> anagramMap = new HashMap<>();

        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);//정렬하게되면 같은 문자열이됨
            String sortedStr = new String(chars);

            if(!anagramMap.containsKey(sortedStr)){
                anagramMap.put(sortedStr, new ArrayList<>());
            }
            anagramMap.get(sortedStr).add(str);
        }
        answer.addAll(anagramMap.values());
       return answer;
    }
}
