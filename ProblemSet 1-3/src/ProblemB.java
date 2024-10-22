import java.util.Scanner;

public class ProblemB
{
    public static void main(String[] args)
    {
        int answer = 0;
        Scanner user_input = new Scanner(System.in);
        double num1 = 1 + (Math.random() * 10);
        double num2 = 1 + (Math.random() * 10);

        int num1_final = (int)num1;
        int num2_final = (int)num2;
        System.out.println("Do you want a problem in Addition, Subtraction, or Multiplication?");
        System.out.print("(Enter 'A', 'S', or 'M')");
        String problem_type = user_input.nextLine();
        if (problem_type.equals("A"))
        {
            answer = (int)num1 + (int)num2;
            System.out.print("What is " + num1_final + " + " + num2_final + "?");
        }
        else if (problem_type.equals("S"))
        {
            answer = (int)num1 - (int)num2;
            System.out.print("What is " + num1_final + " - " + num2_final + "?");
        }
        else if (problem_type.equals("M"))
        {
            answer = (int)num1 * (int)num2;
            System.out.print("What is " + num1_final + " * " + num2_final + "?");
        }
        else
        {
            System.out.println("Invalid input.");
        }

        int user_answer = user_input.nextInt();
        if (user_answer == answer)
        {
            System.out.print("You got it right. Congratulations!");
        }
        else
        {
            System.out.print("Sorry, the correct answer is " + answer);
        }

    }
}
