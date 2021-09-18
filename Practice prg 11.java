import java.util.*;

 class Dcoder
 {
   public static void main(String args[])
   { 
     String str1 = "Hello";
     String str2 =" My java";
     System.out.println(str1==str2);
     Boolean newStr = str1.equals(str2);
     System.out.println(newStr);
     int strlen = str1.length();
 
     System.out.println(strlen);
    char newStr1= str2.charAt(4); 

    String U= str1.toUpperCase();
    System.out.println(U); 
    String l= str1.toLowerCase();
    System.out.println(l);
    
    String newStr3 = str2.replace("My","Our");
    System.out.println(newStr3 + "\n"+newStr1);
  
    String t = str2.trim();
    System.out.println(t);
    Boolean con = str2.contains("java"); 

    System.out.println(con);
   }
 }
