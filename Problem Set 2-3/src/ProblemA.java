import images.APImage;
import images.Pixel;

public class ProblemA
{
    public static void main(String[] args)
    {
        APImage K = new APImage("Screenshot_15.png");
        int halfImageWidth = K.getImageWidth() / 2;
        int imageHeight = K.getImageHeight();
        Pixel line = new Pixel(255, 0, 0);

        for (int yValue = 0; yValue < imageHeight; yValue++)
        {
            K.setPixel(halfImageWidth, yValue, line);
        }
        K.draw();

    }
}
