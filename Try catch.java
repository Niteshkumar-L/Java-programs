public class TryCatchEx {  
  
    public static void main(String[] args) {  
        try  
        {  
        int data=5/0; //may throw exception   
        }  
            //handling the exception  
        catch(Exception a)  
        {  
            System.out.println(a);  
        }  
        System.out.println("rest of the code");  
    }  
      
}
