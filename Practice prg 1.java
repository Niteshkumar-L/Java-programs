Public class Calsum{ 
void sum(int m,int n){
System.out.println(m+n);
} 
void sum(int m,int n,int l){
System.out.println(m+n+l);
} 

   public static void main(String args[]){ 
   Calsum obj1=new Calsum(); 
   obj1.sum(10,10,10); 
   obj1.sum(20,20); 

 } 
}
