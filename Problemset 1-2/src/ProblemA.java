import java.util.Scanner;

public class ProblemA
{
    public static void main(String[] args)
    {
        Scanner user_input = new Scanner(System.in);

        System.out.print("How old are you? ");
        int age = user_input.nextInt();
        System.out.println("You are " + age + " years old.");
        System.out.println("You have been alive for " + (age * 365) + " days. ");
        System.out.println("You have been alive for " + (age * 31536000) + " seconds.");
    }
}
