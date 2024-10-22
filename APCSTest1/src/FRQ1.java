// Jordan Tran, Problem B

import java.util.Scanner;
public class FRQ1
{
    public static void main(String[] args)
    {
        // user input
        Scanner userInput = new Scanner(System.in);
        double max = (int)(Math.random() * 6) + 5; // range of values is 6, minimum is 5
        System.out.print("Please enter an integer between 0 and " + (int)max + ": ");
        int userNumber = userInput.nextInt();


        // output
        if (userNumber > max || userNumber < 0) // checks if the number is out of the range
        {
            System.out.print("That is out of the acceptable range!");
        }
        else // occurs if the number is within range
        {
            int sum = 0;
            for (int digit = 0; digit <= userNumber; digit++) // iterates through all numbers up to the user's number
            {
                sum += digit;
            }
            System.out.print("The sum of the integers from 0 to " + userNumber + " is " + sum + ".");
        }

    }
}
