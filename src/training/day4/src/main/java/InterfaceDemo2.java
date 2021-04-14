interface ABC
{
    int val=500; //implicitly final & static
    static void A() //possible in java 8
    {
        System.out.println("A method");
    }
    default void B() //possible in java 8
    {
        System.out.println("B method");
    }
}

class XYZ implements ABC
{
    void X()
    {
        System.out.println(val);
    }
}

public class InterfaceDemo2 {
    public static void main(String[] args) {
        ABC.A();
        XYZ x=new XYZ();
        x.B();
        x.X();
    }
}
