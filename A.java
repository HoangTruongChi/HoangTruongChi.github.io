import java.util.ArrayList;
import java.util.Scanner;

public class A {
    public static int T;
    public static int n;

    public static long sum = 0;
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Integer> a = new ArrayList<>();
    public static ArrayList<Integer> b = new ArrayList<>();
    public static void input(ArrayList a, ArrayList b) {
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++)
        {
            a[i] = scanner.nextInt();
        }
        for (int i = 1; i <= n; i++)
        {
            b[i] = scanner.nextInt();
        }
    }

    public static void main(String[] args) {

        T = scanner.nextInt();
        for (int o = 1; o <= T; o++) {
            ArrayList<Integer> a = new ArrayList<>();
            ArrayList<Integer> b = new ArrayList<>();
            input(A,B);

            sort(B, B + n);
            for (int k = 1; k <= n; k++) {
                cout << A[k] << ";";
            }
            cout << endl;
            for (int k = 1; k <= n; k++) {
                cout << B[k] << ";";
            }
            cout << endl;
            int m = n;
            for (int i = 1; i <= n; i++) {
                sum += A[i] * B[m];
                m--;
            }
            cout << "Case #1:" << " " << sum;
        }
    }
}
