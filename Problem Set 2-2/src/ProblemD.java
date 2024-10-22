import java.util.Scanner;

public class ProblemD
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userString = userInput.nextLine();
        userString = userString.toLowerCase();
        System.out.println("Your string has the following number of each of these characters:");
        int stringLength = userString.length();
        for (int i = 0; i < stringLength; i++)
        {
            int letterInstances = 0;
            for (int j = 0; j < stringLength; j++)
            {
                if (userString.charAt(i) == userString.charAt(j))
                {
                    letterInstances++;
                }
            }
            System.out.println(userString.charAt(i) + ": " + letterInstances);
        }
    }
}
