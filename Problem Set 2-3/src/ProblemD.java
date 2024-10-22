import images.APImage;
import images.Pixel;

public class ProblemD
{
    public static void main(String[] args)
    {
        APImage pic = new APImage("smokey.jpg");
        int imageHeight = pic.getImageHeight();
        int imageWidth = pic.getImageWidth();

        int red  = 255;
        int green  = 0;
        int blue  = 0;
        Pixel newPixel = new Pixel(red, green, blue);

        // border for top and bottom
        for (int x = 0; x < imageWidth; x++)
        {
            for (int y = 0; y < 20; y++)
            {
                pic.setPixel(x, y, newPixel);
                pic.setPixel(x, (imageHeight-1-y), newPixel);
            }
        }
        // border for left and right
        for (int x = 0; x < 20; x++)
        {
            for (int y = 0; y < imageHeight; y++)
            {
                pic.setPixel(x, y, newPixel);
                pic.setPixel((imageWidth-1-x), y, newPixel);
            }

        }
        // test
        Pixel testPixel = pic.getPixel(90, 19);
        String testPixelValue = testPixel.toString();
        System.out.print(testPixelValue);
        pic.draw();
    }
}
