package Copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by User on 25.10.2015 ã..
 */
public class jpgFile04 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Intellij\\StreamsAnd Files-Homework\\res\\dog.jpg");
        FileOutputStream fos = new FileOutputStream("D:\\Intellij\\StreamsAnd Files-Homework\\res\\my-copied-picture.jpg");
        int byteContainer;
        while ((byteContainer = fis.read()) != -1) {
            fos.write(byteContainer);
        }
        fis.close();
        fos.close();
    }
}
