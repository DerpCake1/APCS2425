import images.APImage;
import images.Pixel;

public class ProblemE
{
    public static void main(String[] args)
    {
        APImage pic = new APImage("Screenshot_15.png");
        int refImageHeight = pic.getImageHeight();
        int refImageWidth = pic.getImageWidth();

        // border
        int borderHeight = refImageHeight + 40;
        int borderWidth = refImageWidth + 40;
        APImage border = new APImage(borderWidth, borderHeight);

        int red  = 255;
        int green  = 0;
        int blue  = 0;
        Pixel newPixel = new Pixel(red, green, blue);

        // create border
        for (int x = 0; x < borderWidth; x++)
        {
            for (int y = 0; y < 20; y++)
            {
                border.setPixel(x, y, newPixel);
                border.setPixel(x, (borderHeight-1-y), newPixel);
            }
        }
        for (int x = 0; x < 20; x++)
        {
            for (int y = 0; y < borderHeight; y++)
            {
                border.setPixel(x, y, newPixel);
                border.setPixel((borderWidth-1-x), y, newPixel);
            }
        }
        for (int x = 0; x < refImageWidth; x++)
        {
            for (int y = 0; y < refImageHeight; y++)
            {
                Pixel currentPixel = pic.getPixel(x, y);
                border.setPixel(x+20, y+20, currentPixel);
            }
        }
    border.draw();
    Pixel testPixel = border.getPixel(borderWidth-21, 40);
    String testPixelValue = testPixel.toString();
    System.out.print(testPixelValue);
    }
}
