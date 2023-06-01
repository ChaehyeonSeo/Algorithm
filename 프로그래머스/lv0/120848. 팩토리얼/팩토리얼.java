class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            if(factorial(i) <= n) {
                answer = i;
            } else {
                break;
            }
        }
        
        return answer;
    }
    public int factorial(int n) {
        int result = 1;
        for(int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}