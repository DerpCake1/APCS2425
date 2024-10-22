import java.util.Scanner;

public class ProblemAB
{
    public static void main(String[] args)
    {
    // Restaurant = Crunchy Burger

        Menu lunchMenu = new Menu("Crunchy Burger");
        Menu dinnerMenu = new Menu("Crunchy Burger");
        Scanner userInput = new Scanner(System.in);

        // Lunch Menu
        lunchMenu.addItem("Crunchy Regular", 43.7);
        lunchMenu.addItem("Crunchy Deluxe", 50.2);
        lunchMenu.addItem("Crunchy Fries", 90.4);

        // Dinner Menu

        dinnerMenu.addItem("Crunchy Deluxe", 19.99);
        dinnerMenu.addItem("Crunchy Feast", 17.29);
        dinnerMenu.addItem("Crunchy Wine", 26.89);

        System.out.print("Lunch Menu: " + lunchMenu);
        System.out.print("Dinner Menu: " + dinnerMenu.toString());

        System.out.print("Which menu would you like?");
        String userMenu = userInput.nextLine();
        Order lunchOrder = new Order(lunchMenu);
        Order dinnerOrder = new Order(dinnerMenu);
        if (userMenu.equals("Lunch") || userMenu.equals("lunch"))
        {
            for (int i = 1; i <= 2; i++)
            {
                System.out.print("What item number would you like?");
                int userOrder = userInput.nextInt();
                System.out.print("How many would you like?");
                int userQuantity = userInput.nextInt();
                lunchOrder.add(userOrder, userQuantity);
            }
            String orderOutput = lunchOrder.toString();
            System.out.print(orderOutput);
            double userTotal = lunchOrder.getTotal();
            System.out.print("How much money do you have?");
            double userMoney = userInput.nextDouble();
            if (userMoney >= userTotal)
            {
                System.out.print("Your change is $" + (userMoney - userTotal) + ".");
            }
            else
            {
                System.out.print("You don't have enough");
            }

        }
    else if(userMenu.equals("Dinner") || userMenu.equals("dinner"))
        {
            for (int i = 1; i <= 2; i++)
            {
            System.out.print("What item number would you like?");
            int userOrder = userInput.nextInt();
            System.out.print("How many would you like?");
            int userQuantity = userInput.nextInt();
            dinnerOrder.add(userOrder, userQuantity);
        }
            String orderOutput = dinnerOrder.toString();
            System.out.print(orderOutput);
            double userTotal = dinnerOrder.getTotal();
            System.out.print("How much money do you have?");
            double userMoney = userInput.nextDouble();
            if (userMoney >= userTotal)
            {
                System.out.print("Your change is $" + (userMoney - userTotal) + ".");
            }
            else
            {
                System.out.print("You don't have enough");
            }
    }
    }
}
