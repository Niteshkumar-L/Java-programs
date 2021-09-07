//prg to record students information
class Stud{ 
int rollno; 
String name; 
 
void insertRecord(int r, String n){ //method 
rollno=r; 
name=n; 
} 

void displayInfo(){System.out.println(rollno+" "+name);}//method 
public static void main(String args[]){ 
Stud s1=new Stud(); 
Stud s2=new Stud(); 
Stud s3=new Stud();
s1.insertRecord(101,"Rajesh"); 
s2.insertRecord(202,"Alex");
s3.insertRecord
(303,"vicky");
s1.displayInfo(); 
s2.displayInfo();
s3.displayInfo();
}
}
