public class test
{
    public static void main(String[] args)
    {
        int random = (int)(Math.random() * 5 + 1);

        for (int i = 0; i < 100; i++) {
            System.out.println(random);
            random = (int)(Math.random() * 5 + 1);
        }
    }
}
