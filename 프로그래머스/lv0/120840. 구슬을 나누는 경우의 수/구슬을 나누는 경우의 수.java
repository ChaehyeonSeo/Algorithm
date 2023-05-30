import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        BigInteger answer = factorial(balls).divide(factorial(balls - share).multiply(factorial(share)));
        return answer.intValue();
    }

	private BigInteger factorial(int n) {
		BigInteger result = BigInteger.ONE;
       for(int i = 1; i <= n; i++) {
        result = result.multiply(BigInteger.valueOf(i));
        } 
		return result;
	}
}