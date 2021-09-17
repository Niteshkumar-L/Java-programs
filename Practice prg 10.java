class Teststrcomp1{  
 public static void main(String args[]){  
   String s01="Hello";  
   String s02="hi";  
   String s03=new String("Hello");  
   String s04="Hi";  
   System.out.println(s01.equals(s02));//false  
   System.out.println(s01.equals(s03));//true  
   System.out.println(s01.equals(s04));//false  
 }  
}
