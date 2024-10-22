import java.util.Scanner;

public class ProblemA
{
    public static void main(String[] args)
    {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10:");
        int num = user_input.nextInt();

        while ( num > 10 || num < 1)
        {
            System.out.println("That is not a valid entry. Try again,");
            num = user_input.nextInt();
        }
        System.out.print("You entered the number " + num + ".");
    }
}
