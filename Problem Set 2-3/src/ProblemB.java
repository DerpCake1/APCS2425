import images.Pixel;
import images.APImage;

public class ProblemB
{
    public static void main(String[] args)
    {
        APImage pic = new APImage("west-puzzle.png");
        int imageHeight = pic.getImageHeight();
        int imageWidth = pic.getImageWidth();

        // parses through all pixels

        for (int x = 0; x < imageWidth; x++)
        {
            for (int y = 0; y < imageHeight; y++)
            {
                Pixel currentPixel = pic.getPixel(x, y);
                currentPixel.setGreen(0);
                currentPixel.setRed(0);
                if (currentPixel.getBlue() >= 16)
                {
                    currentPixel.setBlue(0);
                }
                else
                {
                    currentPixel.setRed(currentPixel.getBlue() * 16);
                }
                currentPixel.setBlue(0);

            }

        }
        pic.draw();
    }
}
