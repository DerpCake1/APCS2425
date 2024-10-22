import java.util.Scanner;

public class ProblemA
{
    public static void main(String[] args)
    {
        Scanner user_input = new Scanner(System.in);

        System.out.print("Enter three numbers, separated by spaces: ");
        int a = user_input.nextInt();
        int b = user_input.nextInt();
        int c = user_input.nextInt();

        if (((a <= b) && (b <= c)) || ((c <= b) && (b <= a)))
        {
                System.out.print("in order");
        }
        else
        {
            System.out.print("not in order");
        }
    }
}
