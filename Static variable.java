class Counter2{ 
static int count=0;//will get memory only once and retain its value 
Counter2(){ 
count++; 
System.out.println(count); 
} 
public static void main(String args[]){ 
Counter2 c01=new Counter2(); 
Counter2 c02=new Counter2(); 
Counter2 c03=new Counter2(); 

} 
 }
