package com.company;
import java.io.*;
public class SumLines01 {

    public static void main(String[] args){
        System.out.println("Write text in lines.txt");
        try(BufferedReader fileReader = new BufferedReader(new FileReader("res/lines.txt"));
            ){
         while(true){
             int sum = 0;
             String line = fileReader.readLine();
                if(line == null)break;
                else{
                    for (int i = 0; i < line.length(); i++) {
                       char currChar = line.charAt(i);
                        sum += currChar;
                    }
                    System.out.println(sum);
                }
            }
         }
           catch (IOException exception){
               System.err.println("file not found");
           }
     }
}
