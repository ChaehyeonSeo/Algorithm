import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());
        List<String> ps = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            String s = in.nextLine();
            ps.add(s);
        }

        for (String s: ps) {
            boolean b = isVPS(s);
            if (b) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean isVPS(String s) {
        Stack<Character> stack = new Stack<>();
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == '(') {
                stack.push('(');
            } else if (s.charAt(j) == ')') {
                if (stack.empty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.empty();
    }
}