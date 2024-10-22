import images.APImage;
import images.Pixel;
import java.util.Scanner;


public class ProblemA
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the first file name: ");
        String file1Name = userInput.nextLine();
        System.out.print("Enter the first file name: ");
        String file2Name = userInput.nextLine();

        // final image dimensions
        APImage file1 = new APImage(file1Name);
        APImage file2 = new APImage(file2Name);
        int f1w = file1.getImageWidth();
        int f2w = file2.getImageWidth();
        int f1h = file1.getImageHeight();
        int f2h = file2.getImageHeight();
        int newImageWidth = 0;
        int newImageHeight = 0;
        if (f1w >= f2w)
        {
            newImageWidth = f1w;
        }
        else
        {
            newImageWidth = f2w;
        }
        if (f1h >= f2h)
        {
            newImageHeight = file1.getImageHeight();
        }
        else
        {
            newImageHeight = f2h;
        }
        APImage finalImage = new APImage(newImageWidth, newImageHeight);

        // uhhh
        for (int x = 0; x < f1w; x++)
        {
            for (int y = 0; y < f1h; y++)
            {
                Pixel f1 = file1.getPixel(x,y);
                Pixel newCurrent = new Pixel(f1.getRed()/2, f1.getGreen()/2,f1.getBlue()/2);
                finalImage.setPixel(x, y, newCurrent);
            }
        }

        for (int x = 0; x < f2w; x++)
        {
            for (int y = 0; y < f2h; y++)
            {
                Pixel f2 = file2.getPixel(x,y);
                Pixel currentPixel = finalImage.getPixel(x,y);
                int newRed = currentPixel.getRed() + f2.getRed()/2;
                int newGreen = currentPixel.getGreen() + f2.getGreen()/2;
                int newBlue = currentPixel.getBlue() + f2.getBlue()/2;
                Pixel newCurrent = new Pixel(newRed, newGreen, newBlue);
                finalImage.setPixel(x, y, newCurrent);
            }
        }

        // generate new image

        finalImage.draw();


    }
}
