class Animals01{  
void eat(){System.out.println("eating...");}  
}  
class Dogs extends Animals01{  
void bark(){System.out.println("barking...");}  
}  
class BabyDogs extends Dogs{  
void weep(){System.out.println("weeping...");}  
}  
class TestInheritance{  
public static void main(String args[]){  
BabyDogs d=new BabyDogs();  
d.weep();  
d.bark();  
d.eat();  
}}
