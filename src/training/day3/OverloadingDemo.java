package training.day3;

class Shape
{
    public void area(int s)
    {
        System.out.println("Area of square :"+s*s);
    }
    public void area(float l,float b)
    {
        System.out.println("Area of rectangle :"+l*b);
    }
    public void area(float r)
    {
        System.out.println("Area of circle"+3.14*r*r);
    }
}
public class OverloadingDemo {
    public static void main(String[] args) {
        Shape sh=new Shape();
        sh.area(5);
        sh.area(3.7f);
        sh.area(2.7f,1.8f);
    }
}
