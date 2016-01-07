import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SaveArrayListOfDoubles05 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Enter list of doubles separated by a space:");
        Scanner input = new Scanner(System.in);
        String[] inputStringArray = input.nextLine().split(" ");
        List<Double> doubles = new ArrayList();
        for (int i = 0; i <inputStringArray.length ; i++) {
            double number = Double.parseDouble(inputStringArray[i]);
            doubles.add(number);
        }
        ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream("D:\\Intellij\\StreamsAnd Files-Homework\\res\\doubles.list"));
        oos.writeObject(doubles);
        oos.flush();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Intellij\\StreamsAnd Files-Homework\\res\\doubles.list"));
        System.out.println(ois.readObject());
        ois.close();
    }
}

