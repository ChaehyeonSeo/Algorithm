class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                answer += String.valueOf(' ');
            } else if(s.codePointAt(i) >= (int)'a' && s.codePointAt(i) <= (int)'z'){
                answer += String.valueOf((char)((int)'a'+ (((s.codePointAt(i) + n) - ((int)'a')) % 26) ));
            } else if(s.codePointAt(i) >= (int)'A' && s.codePointAt(i) <= (int)'Z'){
                answer += String.valueOf((char)((int)'A'+ (((s.codePointAt(i) + n) - ((int)'A')) % 26) ));
            }
        }
        return answer;
    }
}