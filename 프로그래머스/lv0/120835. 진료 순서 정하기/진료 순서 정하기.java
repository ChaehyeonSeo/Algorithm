import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        Integer[] sortArr = Arrays.stream(emergency).boxed().toArray(Integer[] :: new);
        Arrays.sort(sortArr, Collections.reverseOrder());
        for(int i = 0; i < emergency.length; i++) {
            for(int j = 0; j < sortArr.length; j++) {
                if(emergency[i] == sortArr[j]) {
                    answer[i] = j + 1;
                }
            }
        }
        return answer;
    }
}