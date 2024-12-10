import java.util.Scanner;
class CombineStrings
{
    String CombineString(String a , String b)
    {
        if(a.length() < b.length())
        {
            return a+b+a;
        }
        else
        {
            return b+a+b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        CombineStrings obj = new CombineStrings();
        System.out.println(obj.CombineString(a, b));
    }
}