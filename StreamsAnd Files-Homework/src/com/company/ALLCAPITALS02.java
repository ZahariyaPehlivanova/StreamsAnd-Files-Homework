package com.company;
import java.io.*;
public class ALLCAPITALS02 {

    public static void main(String[] args){
        try(BufferedReader fileReader = new BufferedReader( new FileReader("res/lines.txt"))) {

            String line;
            String result = "";

            while ((line = fileReader.readLine()) != null) {
                line = line.toUpperCase();
                result += line + " ";
            }
            FileWriter fileWriter = new FileWriter("res/lines.txt");
            PrintWriter writer = new PrintWriter(fileWriter);

            writer.println(result);
            writer.flush();
        }
         catch (IOException exception){
        System.err.println("file not found");
       }
    }
}
