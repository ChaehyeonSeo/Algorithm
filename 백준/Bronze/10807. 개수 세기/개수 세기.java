import java.util.Hashtable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Hashtable<Integer, Integer> ht = new Hashtable<>();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            ht.put(num, (ht.get(num) != null) ? ht.get(num) + 1 : 1);
        }

        int v = in.nextInt();
        int answer = (ht.get(v) != null) ? ht.get(v) : 0;
        System.out.println(answer);
    }
}