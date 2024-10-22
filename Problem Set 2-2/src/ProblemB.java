import java.util.Scanner;

public class ProblemB
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Triangle Generator: 'r' for row, 'c' for column: ");
        String typeOfTriangle = userInput.nextLine();
        System.out.print("Number of rows?: ");
        int userRows = userInput.nextInt();
        int currentCount = 1;
        if (typeOfTriangle.equals("r"))
        {
            for (int rows = 1; rows <= userRows; rows++)
            {
                for (int columns = 1; columns <= currentCount; columns++)
                {
                    System.out.print(rows);
                }
                currentCount++;
                System.out.println();
            }
        }
        else if (typeOfTriangle.equals("c"))
        {
            for (int rows = 1; rows <= userRows; rows++)
            {
                for (int columns = 1; columns <= currentCount; columns++)
                {
                    System.out.print(columns);
                }
                currentCount++;
                System.out.println();
            }
        }
        else
        {
            System.out.print("Invalid input.");
        }
    }
}
