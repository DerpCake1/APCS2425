import java.util.Scanner;
public class ProblemC // tax brackets
{
    public static void main(String[] args) // these tax brackets were found from smartasset.com
    {
        double taxed_amount = 0;
        int previous_max = 0;
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter your income. ");
        double user_income = (double)user_input.nextInt();
        if (user_income < 11600) // 10%
        {
            taxed_amount += (user_income * 0.1);
        }
        else
        {
            taxed_amount += (11600 * 0.1); // left number = max of that tax bracket
            previous_max = 11600;
            if (user_income > 47150) // 12%
            {
                taxed_amount += (47150 - previous_max) * 0.12;
                previous_max = 47150;
                if (user_income > 100525) // 22%
                {
                    taxed_amount += (100525 - previous_max) * 0.22;
                    previous_max = 100525;
                    if (user_income > 191950) // 24%
                    {
                        taxed_amount += (191950 - previous_max) * 0.24;
                        previous_max = 191950;
                        if (user_income > 243725) // 32%
                        {
                            taxed_amount += (243725 - previous_max) * 0.32;
                            previous_max = 243725;
                            if (user_income > 609350) // 32%
                            {
                                taxed_amount += (609350 - previous_max) * 0.35;
                                previous_max = 609350;
                                taxed_amount += (user_income - previous_max) * 0.37;

                            }
                            else
                            {
                                taxed_amount += (user_income - previous_max) * 0.35;
                            }

                        }
                        else
                        {
                            taxed_amount += (user_income - previous_max) * 0.32;
                        }

                    }
                    else
                    {
                        taxed_amount += (user_income - previous_max) * 0.24;
                    }

                }
                else
                {
                    taxed_amount += (user_income - previous_max) * 0.22;
                }

            }
            else
            {
                taxed_amount += (user_income - previous_max) * 0.12;
            }
        }
        System.out.print((int)taxed_amount);
    }
}
