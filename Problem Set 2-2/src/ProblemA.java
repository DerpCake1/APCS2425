public class ProblemA
{
    public static void main(String[] args)
    {
        // allows adjustable size
        int max = 10;
        for (int rows = 1; rows <= max; rows++)
        {
            for (int columns = 1; columns <= max; columns++)
            {
                int number = columns * rows;
                System.out.print(number + "\t");
            }
            System.out.println();
        }
    }
}
