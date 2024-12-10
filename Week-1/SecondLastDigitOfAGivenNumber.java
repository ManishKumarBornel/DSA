import java.util.Scanner;
class SecondLastDigitOfAGivenNumber 
{
    public static int digit(int number)
    {
    if(number/10==0)
    {
        return -1;
    }
    else
    {
        number = Math.abs(number);
        return (number/10)%10;
    }
    
}
public static void main(String[] args) 
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int number = sc.nextInt();

    SecondLastDigitOfAGivenNumber obj = new SecondLastDigitOfAGivenNumber();
    int result = obj.digit(number);
    System.out.println("ENTER THE RESULT " + result);
}
}