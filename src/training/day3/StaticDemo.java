package training.day3;
class Operation
{

    public static int var=20;
    public void add(int n1,int n2)
    {
        System.out.println(n1+n2);
    }
    public void sub(int n1,int n2)
    {
        System.out.println(n1-n2);
    }

    public static void mul(int n1,int n2)
    {
        System.out.println(n1*n2);
    }
    public static void div(int n1,int n2)
    {
        System.out.println(n1/n2);
    }

    static{
        System.out.println("Static block");
        var=40;
        System.out.println("Static variable :"+var);

    }

}
public class StaticDemo{
    public static void main(String[] args) {
        Operation op=new
                Operation();
        op.add(40,20);
        op.sub(40,20);
        Operation.div(40,20);
        Operation.mul(40,20);
        System.out.println("Static variable :"+Operation.var);


    }
        }
