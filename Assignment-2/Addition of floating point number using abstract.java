//Program to Add floating numbers using abstract class
abstract class absad{
   abstract void add();
}
public class addoffloatusingabstract extends absad{
    public void add(){
        float a=10.025688f;
        float b=00.018692f;
        System.out.println(a+b);
    }
    public static void main(String args[])
    {
        addoffloatusingabstract o=new addoffloatusingabstract();
        o.add();
    }
}
