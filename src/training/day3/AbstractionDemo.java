package training.day3;

abstract class Shape2
{
  abstract float area();
  public void display(float ans)
  {
      System.out.println("Area is :"+ans);
  }
}
class Triangle extends Shape2
{
    float area()
    {
        return 0.5f*3.5f*2.1f;
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Shape2 sh=new Triangle();//creating obj of child and saving it in reference of parent class
        float ans=sh.area();
        sh.display(ans
        );
    }
}
