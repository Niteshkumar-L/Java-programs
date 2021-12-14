

import java.nio.file.Files;
import java.nio.file.Path;

import java.io.IOException;
 

public class GFG {
 
  
    public static void main(String[] args) throws IOException
    {
 
        String text  = "Welcome to geekforgeeks\nHappy Learning!";

        Path fileName = Path.of("/Users/mayanksolanki/Desktop/demo.docx");
        Files.writeString(fileName, text)
        String file_content = Files.readString(fileName);
        System.out.println(file_content);
    }
}
