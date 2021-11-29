//Prg To Add Two floating point Numbers
class addfloat
{
  float a=25.f;
  float b=68.f;
}
public class additionoffloat extends addfloat
{
    float add=a+b;
    public static void main(String args[])
    {
        additionoffloat obj= new additionoffloat();
        System.out.print("addition of float:"+obj.add);
    }
    
}
