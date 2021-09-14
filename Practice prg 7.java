//Example of Method Overloading by changing data type of argument
class Cal{ 
void area(int a)
{
  System.out.println("area of square:"+ a*a);
} 
void area(double a,double b)
{
  System.out.println("area of rectangle:"+ a*b);
  } 

public static void main(String args[]){ 
Cal obj=new Cal(); 
obj.area(10.5,10.5); 
obj.area(20);
}
}
