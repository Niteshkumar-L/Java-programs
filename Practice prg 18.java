//Example of this keyword that you return as a statement from the method
class A{ 
A getA(){ 
return this; 
} 
 void msg(){System.out.println("welcome to java");} 
} 

class Test1{ 
public static void main(String args[]){ 
 new A().getA().msg(); 
} 
 } 
