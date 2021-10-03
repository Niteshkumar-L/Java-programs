class Vehicle{  
  //defining a method  
  void run()
  {
    System.out.println("Vehicle is running");
    }  
}  
//Creating a child class  
class Bike01 extends Vehicle{  
  //defining the same method as in the parent class  
  void run()
  {
    System.out.println("Bike is running safely");
    }  
  
  public static void main(String args[]){  
  Bike01 obj = new Bike01();//creating object  
  obj.run();//calling method  
  }  
}
