import java.util.Scanner;
import unit2.FlexString;
public class test
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        FlexString userString = new FlexString(userInput.nextLine());

        userString.remove(1, 2);
        System.out.print(userString);
    }
}
