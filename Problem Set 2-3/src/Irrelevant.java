import images.APImage;
import images.Pixel;

public class Irrelevant
{
    public static void main(String[] args)
    {
        APImage K = new APImage("Screenshot_15.png");
        int imageWidth = K.getImageWidth();
        int halfImageWidth = K.getImageWidth() / 2;
        int imageHeight = K.getImageHeight();
        Pixel line = new Pixel(255, 0, 0);

        for (int x = 0; x < imageWidth; x++)
        {
            for (int y = 0; y < imageHeight; y++)
            {
               Pixel currentPixel = K.getPixel(x,y);
               Pixel trans = new Pixel(currentPixel.getRed()/2, currentPixel.getGreen()/2, currentPixel.getBlue()/2);
               K.setPixel(x,y, trans);

            }
        }
        K.draw();
    }
}
