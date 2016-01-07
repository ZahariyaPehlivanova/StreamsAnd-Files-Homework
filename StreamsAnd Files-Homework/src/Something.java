import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by User on 27.10.2015 ã..
 */
public class Something {
    public static void main(String[] args) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("res\\dog.jpg"));
        } catch (IOException e) {
        }
    }
}
