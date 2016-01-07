import java.io.*;
public class CountCharacterTypes03{

public static void main(String[]args){

         System.out.println("Write text in words.txt and check the result in count-chars.txt");
        try(BufferedReader fileReader=new BufferedReader(new FileReader("res/words.txt"))){

        String line;
        int vowelsCount = 0;
        int consonatsCount = 0;
        int punctuation = 0;
        while((line=fileReader.readLine())!=null){
             for (int i = 0; i < line.length(); i++) {
                line = line.replaceAll("\\s+","");
                char currChar = line.charAt(i);
                    if (currChar == '?' || currChar == '!' || currChar == ',' || currChar == '.'){
                            punctuation++;
                    }
                    else if(currChar == 'a' || currChar == 'e' || currChar == 'i' ||currChar == 'o'||currChar == 'u'){
                            vowelsCount++;
                    }
                    else{
                            consonatsCount++;
                    }
                }
        }
        FileWriter fileWriter=new FileWriter("res/count-chars.txt");
        PrintWriter writer=new PrintWriter(fileWriter);

        writer.println("Vowels: " + vowelsCount);
        writer.println("Consonats: "+consonatsCount);
        writer.println("Punctuation: "+punctuation);
        writer.flush();
        }
        catch(IOException exception){
        System.err.println("file not found");
        }
    }
}
