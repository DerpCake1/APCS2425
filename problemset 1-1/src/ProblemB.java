import java.util.Scanner;

public class ProblemB {
    public static void main(String[] args) {
        // scanner stuff
        Scanner user_input = new Scanner(System.in);


//
//
//        String sample4 = user_input.nextLine();
        System.out.print("Welcome to the interview! Is it true that you wanted to even see us? (Enter True or False) ");
        boolean wanted_to_attend = user_input.nextBoolean();
        System.out.print("Ok, well as the interviewer, how do rate me from a 1 - 10? ");
        double rating = user_input.nextDouble();
        System.out.print("I'm flattered, but this is a professional setting. How many year(s) of experience do you have working in the plumbing industry? ");
        int work_experience = user_input.nextInt();
        user_input.nextLine();
        System.out.print("That's good to hear, considering this is a stock brokerage. Finally, give me an attribute that puts you above other candidates: ");
        String one_word = user_input.nextLine();

        System.out.println("");
        System.out.println("Debrief: ");
        System.out.println("After asking the candidate, it turns out it was " + wanted_to_attend +  " that they even wanted to be here.");
        System.out.println("They then proceeded to rate me a " + rating + " out of 10. Honestly thought I deserved higher, but ok. ");
        System.out.println("They told me that they had " + work_experience + " years of experience in the plumbing industry. ");
        System.out.println("Finally, the single attribute that decribes their edge over other candidates before them was: " + one_word);
    }
}
