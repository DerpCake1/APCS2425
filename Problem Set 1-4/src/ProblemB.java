import java.util.Scanner;

public class ProblemB
{
    public static void main(String[] args)
    {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = user_input.nextInt();

        while(num != 1)
        {
            num = num / 2;
            if (num % 2 == 1)
            {
                System.out.println(num + " *");
            }
            else
            {
                System.out.println(num);
            }
        }
    }
}
