class Solution {
    public String solution(String my_string) {
        char[] array = new char[my_string.length()];
        for(int i = 0; i < my_string.length(); i++) {
            array[i] = my_string.charAt(my_string.length()-i-1);
        }
        String answer = String.valueOf(array);
        
        return answer;
    }
}