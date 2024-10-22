import java.util.Scanner;
public class ProblemCD
{
    public static void main(String[] args)
    {
      Scanner userInput = new Scanner(System.in);
      System.out.print("Enter string 1: ");
      String string1 = userInput.nextLine();
      System.out.print("Enter string 2: ");
      String string2 = userInput.nextLine();
      int length = string2.length();

      while (string1.indexOf(string2) != -1)
      {
          int indexToRemove = string1.indexOf(string2);
          String part1 = string1.substring(0, string1.indexOf(string2));
          String part2 = string1.substring(indexToRemove + length);
          string1 = part1 + part2;
      }
        System.out.println(string1);

    }
}