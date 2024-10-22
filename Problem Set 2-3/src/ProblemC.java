import images.Pixel;
import images.APImage;
import java.util.Scanner;


public class ProblemC
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your file name:");
        String fileName = userInput.nextLine();
        System.out.print("Enter the RGB Values");
        int red  = userInput.nextInt();
        int green  = userInput.nextInt();
        int blue  = userInput.nextInt();
        APImage pic = new APImage(fileName);
        int imageHeight = pic.getImageHeight();
        int imageWidth = pic.getImageWidth();

        // parses through all pixels

        for (int x = 0; x < imageWidth; x++)
        {
            for (int y = 0; y < imageHeight; y++)
            {
                Pixel currentPixel =  pic.getPixel(x, y);
                int newRed = red + currentPixel.getRed();
                int newGreen = green + currentPixel.getGreen();
                int newBlue = blue + currentPixel.getBlue();

                currentPixel.setRed(newRed);
                currentPixel.setGreen(newGreen);
                currentPixel.setBlue(newBlue);
            }

        }
        pic.draw();
    }

}
