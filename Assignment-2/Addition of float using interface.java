interface addfloat
{
    public void add();
}
public class addoffloatusinginterface implements addfloat
{
    public void add()
    {
        float a=30.0f;
        float b=98;
        System.out.println(a+b);
    }
    public static void main(String args[])
    {
        addoffloatusinginterface obj= new addoffloatusinginterface();
       obj.add();
    }
    
}
