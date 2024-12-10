import java.util.Scanner;
public class SumOfLastTwoDigits 
{
    int addLastDigits(int n1, int n2)
    {
        int lastdigit1 =n1%10;
        int lastdigit2 = n2%10;
        return lastdigit1+lastdigit2;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        SumOfLastTwoDigits obj = new SumOfLastTwoDigits();
        System.out.println(obj.addLastDigits(a, b));
    }
}