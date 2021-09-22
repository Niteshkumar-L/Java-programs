interface one{
    void areasq();
    
}
public class two implements one
{
    public void areasq(){
        int a=5;
        System .out.println("area of square:"+a*a);
        
    }
    

public static void main(String args[])
{
    two cl=new two();
    cl.areasq();
}
}
