public class DisplayOddnumbersExample2  
{  
public static void main(String[] args)   
{  
System.out.println("List of odd numbers: ");       
//method calling  
displayOddNumbers(1, 100);   
}   
//method that checks the number is odd or not  
private static void displayOddNumbers(int number, int end)   
{   
if(number>end)   
return;   
if(number%2!=0)   
{   

System.out.print(number +" "); 
displayOddNumbers(number + 2, end);   
}   
else   
{   
  
displayOddNumbers(number + 1, end);   
}   
}   
} 
