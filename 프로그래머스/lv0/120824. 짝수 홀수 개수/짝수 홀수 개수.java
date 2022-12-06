class Solution {
    public int[] solution(int[] num_list) {
        int cntodd = 0;
        int cnteven = 0;
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0){
                cnteven++;
            } else cntodd++;
        }
        int[] answer = {cnteven, cntodd};
        return answer;
    }
}