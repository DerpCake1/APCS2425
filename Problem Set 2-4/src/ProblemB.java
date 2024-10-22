import images.APImage;
import images.Pixel;
import java.util.Scanner;



public class ProblemB
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the first file name: ");
        String fileName = userInput.nextLine();
        System.out.print("Scale down factor: ");
        int scale = userInput.nextInt();

        APImage file = new APImage(fileName);

        int imgW = file.getImageWidth();
        int imgH = file.getImageHeight();
        APImage Fimg = new APImage(imgW/scale, imgH/scale);
        int newW = imgW/scale;
        int newH = imgH/scale;

        for (int x = 0; x < newW; x++)
        {
            for (int y = 0; y < newH; y++)
            {
                Pixel currentP = file.getPixel(x*scale, y*scale);
                Fimg.setPixel(x,y, currentP);
            }
        }
        Fimg.draw();
    }
}
