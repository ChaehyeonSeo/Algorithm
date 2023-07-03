import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        int answer = 0;
        for (int i = 0; i < S.length(); i++) {
            if (isPalindrome(S.substring(i))) {
                answer = i + S.length();
                break;
            }
        }

        System.out.println(answer);
    }

    private static boolean isPalindrome(String S) {
        boolean result = true;
        for (int i = 0; i < S.length()/2 + 1; i++) {
            if (S.charAt(i) != S.charAt(S.length() - 1 - i)) {
                result = false;
                break;
            }
        }
        return result;
    }
}