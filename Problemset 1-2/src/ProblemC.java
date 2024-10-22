import java.util.Scanner;

public class ProblemC
{
    public static void main(String[] args)
    {
        Scanner user_input = new Scanner(System.in);

        System.out.print("Enter the earlier time: ");
        int early_time = user_input.nextInt();
        System.out.print("Enter the later time: ");
        int later_time = user_input.nextInt();

        int early_hours = (early_time / 100) * 60;
        int early_minutes = early_time % 100;

        int later_hours = (later_time / 100) * 60;
        int later_minutes = later_time % 100;

        int calc_hours = (later_hours - early_hours);
        int calc_minutes = (later_minutes - early_minutes);
        int total_time = calc_hours + calc_minutes;

        System.out.print((total_time) / 60 + " Hour(s) and " + ( (total_time) % 60) + " minute(s).");
    }
}
