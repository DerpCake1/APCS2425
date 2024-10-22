import java.util.Scanner;

public class ProblemC
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.print("How many players will participate?: ");
        int playerAmount = userInput.nextInt();


        // set up players
        Tournament fortniteWorlds = new Tournament();
        for (int i = 0; i < playerAmount; i++)
        {
            double skillLevel = Math.random();
            fortniteWorlds.addPlayer(skillLevel);
        }

        // runs tournament
        int playersLeft = 0;
        for (int player = 0; player < playerAmount; player++)
        {
            for (int j = 0; (j+playersLeft) < playerAmount; j++)
            {
                if (player != (j+playersLeft))
                {
                    fortniteWorlds.play(player, (j + playersLeft));
                }
            }
            playersLeft += 1;
        }

        for (int player = 0; player < playerAmount; player++)
        {
            int wins = fortniteWorlds.getNumWins(player);
            System.out.println("Player " + player + " wins: " + wins);
        }

    }
}
