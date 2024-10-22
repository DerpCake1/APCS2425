import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String response;
        System.out.println("Favorite Game: Portal 2");
        System.out.println("Favorite Sport: Basketball");
        System.out.println("Favorite Album: X&Y");
        System.out.println("Favorite Programming Language: Python");

        Scanner input = new Scanner(System.in);


        response = input.nextLine();

        System.out.println("Clone: " + response);

    }
}