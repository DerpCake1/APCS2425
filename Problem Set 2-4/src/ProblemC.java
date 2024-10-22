import unit2.FlexString;
import java.util.Scanner;

public class ProblemC
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String rawString = userInput.nextLine();
        FlexString userString = new FlexString(rawString);
        int stringLength = userString.length();

        for (int i = 0; i < stringLength-2; i++)
        {
            String previous = userString.substring(i, i+2);
            int next = i+2;

            if (userString.matches(next, previous))
            {
                userString.remove(i, i+2);
                userString.insert(i+2, "**");


            }

        }
        System.out.println("The modified version is: ");
        System.out.println(userString);
        System.out.print("It was modified " + userString.numTimesModified() + " times. ");


    }
}
