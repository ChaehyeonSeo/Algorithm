class Solution {
    public int solution(int[] numbers, int k) {
        int turn = (2 * (k-1)) % numbers.length;
        int answer = numbers[turn];
        return answer;
    }
}