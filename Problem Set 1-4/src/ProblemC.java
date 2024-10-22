import java.util.Scanner;
public class ProblemC
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        // plan 1
        int dayFunds = 0;
        int plan1Sum = 0;
        double weekFunds = 0.01;
        double plan2Sum = 0;
        System.out.println("Day\tAmount");
        for (int days = 1; days <= 365; days++)
        {
            dayFunds = dayFunds + days;
            plan1Sum += dayFunds;
            System.out.println(days + "\t  " + dayFunds);
        }
        System.out.println("Total:" + "\t" + plan1Sum);

        System.out.print("Enter any key for Plan 2: ");

        // plan 2
        userInput.nextLine();
        System.out.println("Week\tAmount");
        for (int weeks = 1; weeks <= 52; weeks++)
        {
            plan2Sum += weekFunds;
            System.out.println(weeks + "\t  " + weekFunds);
            weekFunds = weekFunds * 2;

        }
        System.out.println("Total:" + "\t" + plan2Sum);



        // questions

        // 1: The 2nd plan has a total that is larger than the 1st plan, 4.503599627370495E13 > 8171255

        // 2: The first plan only recieves 0.8% of the total in the last payment,
        // the second plan recieves 50% of the total
    }
}
