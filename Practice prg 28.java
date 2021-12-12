import java.io.FileOutputStream;
import java.io.IOException;
 
public class GFG {
 
 
    public static void main(String[] args)
    {
 
       
        String fileContent = "Welcome to geeksforgeeks";
 
      
        try {
 
           
            FileOutputStream outputStream
                = new FileOutputStream("file.txt");
 
           
            byte[] strToBytes = fileContent.getBytes();
 
           
            outputStream.write(strToBytes);
 
       
            System.out.print(
                "File is created successfully with the content.");
 
            
            outputStream.close();
        }
 
      
        catch (IOException e) {
          
            System.out.print(e.getMessage());
        }
    }
}
