interface Shape
{
    void display(float ans);
    float area();
}

class Circle implements Shape
{
    public void display(float ans)
    {
        System.out.println("Area of circle is :"+ ans);
    }

    public float area()
    {
        float r=2.56f;
        return 3.14f*r*r;
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Shape s=new Circle();
        float ans=s.area();
        s.display(ans);
    }
}
