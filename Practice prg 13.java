//java copy constructor
class Studinfo6{ 
int id; 
String name; 
Studinfo6(int i,String n){ 
id = i; 
name = n; 
 } 
 Studinfo6(Studinfo6 s){ 
 id = s.id; 
 name =s.name; 
 } 
 void display(){System.out.println(id+" "+name);} 

 public static void main(String args[]){ 
 Studinfo6 stud1 = new Studinfo6(101,"Nitesh"); 
 Studinfo6 stud2 = new Studinfo6(stud1); 
 stud1.display(); 
 stud2.display(); 
} 
}
