import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] x3 = new int[n];
        int[] count = new int[20];

        for (int i = 0; i < n; i++) {
            int name = Integer.parseInt(br.readLine());
            x3[i] = name;
        }

        for (int i = 0; i < n; i++) {
            int j = 0;
            while (x3[i] != 0) {
                count[j++] += x3[i] % 2;
                x3[i] /= 2;
            }
        }

        long answer = 0;
        for (int i = 19; i >= 0; i--) {
            answer += (long) count[i] * (long) (n - count[i]);
            answer *= 2;
        }
        answer /= 2;

        System.out.println(answer);
    }
}