import java.util.Scanner;
public class PadovanSequence {
    public static int padovan(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return 1;
        }
        int p0 = 1;
        int p1 = 1;
        int p2 = 1;
        int result = 0;
        for (int i = 3; i <= n; i++) {
            result = p0 + p1;
            p0 = p1;
            p1 = p2;
            p2 = result;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
        for (int i = 0; i <= num; i++) {
            System.out.print(padovan(i) + " ");
        }
    }
}

