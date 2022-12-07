import java.util.*;
class Solution {
    public String solution(int age) {
        String answer = "";
        while(true) {
            int num = age % 10;
            answer = (char)((int)'a' + num) + answer; 
            age = age / 10;
            if(age == 0) break;
        }
        return answer;
    }
}