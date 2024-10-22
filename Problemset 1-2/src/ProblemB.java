import java.util.Scanner;

public class ProblemB
{
    public static void main(String[] args)
    {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int num1 = user_input.nextInt();
        System.out.print("Enter the Second Number: ");
        int num2 = user_input.nextInt();

        int sum = num1 + num2;
        int product = num1 * num2;
        int difference = num1 - num2;
        double quotient = (double)num1 / num2;
        double average = (double)(num1 + num2) / 2;
        int division1 = num1 / num2;
        int division2 = num1 % num2;
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Difference: " + difference);
        System.out.println("Quotient: " + quotient);
        System.out.println("Average: " + average);
        System.out.println("Integer Division: " + division1 + " remainder " + division2);


    }
}
