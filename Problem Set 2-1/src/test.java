import java.util.Scanner;
public class test
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        String myString = "Hello";

        int retVal = myString.length();
        int ind = myString.indexOf("l");
        System.out.println(ind);
    }
}

