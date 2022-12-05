import java.util.*;
class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int arrmax = array[array.length-1];
        System.out.println("arrmax = " + arrmax);
        int[] cnt = new int[arrmax + 1]; 
        for(int i = 0; i < cnt.length; i++) {
            for(int j = 0; j < array.length; j++) {
                if(array[j] == i) {
                    cnt[i] += 1;
                    System.out.println("cnt[" + i + "]=" + cnt[i]);
                }
            }
        }
        
        int answer = 0;
        int bin = 0;
        for(int i = 0; i < cnt.length; i++) {
            if(bin <= cnt[i]) {
                bin = cnt[i];
                answer = i;
            } 
        }
        for(int i = 0; i < cnt.length; i++) {
        	if((cnt[answer] == cnt[i]) && i != answer) {
        		answer = -1;
        		break;
        	}
        }
        return answer;
    }
}