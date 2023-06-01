class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){ // n 이하의 합성수 i
            int j = 1;
            int div = 0; // 약수의 개수
            while(j <= i/2) {
                if(i % j == 0) { // j가 i의 약수이면
                    div += 1;
                }
                if(div >= 2) { // i가 합성수
                    answer += 1;
                    break; 
                } else {
                    j++;
                }
            }
        }
        return answer;
    }
}