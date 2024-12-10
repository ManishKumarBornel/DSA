public class EvenOrOdd {
    public static int countNumbers(int num1, int num2, int num3, int num4, int num5, String type) {
        int count = 0;
        if (type.equals("even")) {
            if (num1 % 2 == 0) count++;
            if (num2 % 2 == 0) count++;
            if (num3 % 2 == 0) count++;
            if (num4 % 2 == 0) count++;
            if (num5 % 2 == 0) count++;
        } else if (type.equals("odd")) {
            if (num1 % 2 != 0) count++;
            if (num2 % 2 != 0) count++;
            if (num3 % 2 != 0) count++;
            if (num4 % 2 != 0) count++;
            if (num5 % 2 != 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 17;
        int num3 = 19;
        int num4 = 14;
        int num5 = 115;
        String type = "odd";
        int result = countNumbers(num1, num2, num3, num4, num5, type);
        System.out.println("Output: " + result);
    }
}
