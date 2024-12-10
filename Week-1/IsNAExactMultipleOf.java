import java.util.Scanner;
public class IsNAExactMultipleOf 
{
    int checkMultiple(int num1, int num2)
    {
        if( num1==0 || num2==0)
        {
            return 3;
        }
        if(num1%num2==0)
        {
            return 2;
        }
        else
        {
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();        
        int num2 = sc.nextInt();
        IsNAExactMultipleOf obj = new IsNAExactMultipleOf();
        System.out.println(obj.checkMultiple(num1, num2));
    }
}