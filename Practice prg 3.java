class Cal
{ 
 
void fact(int n){ 
int fact=1; 
for(int i=1;i<=n;i++){ 
 fact=fact*i; 
} 
System.out.println("factorial is "+fact); 
} 
Public static void main(String args[]){ 
new Cal().fact(8);
} 
}
