import java.util.Scanner;

public class AlternateStringCombiner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String result = combineStrings(a, b);
        System.out.println(result);
    }  
    public static String combineStrings(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int maxLength = Math.max(a.length(), b.length());

        for (int i = 0; i < maxLength; i++) {
            if (i < a.length()) {
                sb.append(a.charAt(i));
            }
            if (i < b.length()) {
                sb.append(b.charAt(i));
            }
        }

        return sb.toString();
    }
}