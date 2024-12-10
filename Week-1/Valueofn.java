public class ValueOfN {
    public static long powerOfReverse(int N, int R) {
        long result = 1;
        while (R > 0) {
            if (R % 2 == 1) {
                result = (result * N) % 1000000007;
            }
            N = (N * N) % 1000000007;
            R /= 2;
        }
        return result;
    }

    public static void main(String[] args) {
        int N = 2;
        int R = 2;
        long result = powerOfReverse(N, R);
        System.out.println(result);
    }
}