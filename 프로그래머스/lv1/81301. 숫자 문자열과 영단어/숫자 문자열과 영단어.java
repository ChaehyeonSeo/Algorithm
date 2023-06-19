class Solution {
    public int solution(String s) {
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for (int i = 0; i < 10; i++) {
            while (s.indexOf(words[i]) != -1) {
                s = s.replace(words[i], Integer.toString(i));
            }
        }
        
        int answer = Integer.parseInt(s);
        return answer;
    }
}