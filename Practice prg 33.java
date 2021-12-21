public class one{ 
one getA(){ 
return this; 
} 
void msg(){System.out.println("Hello to java world");} 
} 
class Test1{ 
public static void main(String args[]){ 
new one().getA().msg(); 
} 
}
