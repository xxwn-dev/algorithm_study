import java.util.*;
class Solution {
    public String[] reorderLogFiles(String[] logs) {
        //사전순정렬이니까 compareTo쓰는걸 잊지 말기
        List<String> letterLogs  = new ArrayList<>();
        List<String> digitLogs = new ArrayList<>();

        for(String str : logs){
            String[] splitArr = str.split(" ", 2);
            String identifier = splitArr[0];
            String content = splitArr.length > 1 ? splitArr[1] :"";
            if(content.matches("[a-z ]+")){//영문자와 공백으로만
                letterLogs.add(str);
            } else {
                digitLogs.add(str);
            }
        }
        letterLogs.sort(new Comparator<String>(){
            @Override
            public int compare(String log1, String log2){
                String[] part1 = log1.split(" ", 2);
                String[] part2 = log2.split(" ", 2);
                String content1 = part1[1];
                String content2 = part2[1];
                int contentCompare = content1.compareTo(content2);
                if(contentCompare != 0){
                    return contentCompare;
                }
                return part1[0].compareTo(part2[0]);
            }
        });

        List<String> reorderedLogs = new ArrayList<>();
        reorderedLogs.addAll(letterLogs);
        reorderedLogs.addAll(digitLogs);
        return reorderedLogs.toArray(new String[0]);

    }
}
