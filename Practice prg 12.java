import java.util.*;  
class Swap_With1 {  
    public static void main(String[] args) {  
       int a, b, t;// x and y are to    
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the value of A and B");  
       a = sc.nextInt();  
       b = sc.nextInt();  
       System.out.println("before swapping numbers: A:"+a +" B: "+ b);  
       /*swapping */  
       t = a;  
       a = b;  
       b = t;  
       System.out.println("After swapping: A: "+a +" B:  " +b);  
       System.out.println( );  
    }    
}
