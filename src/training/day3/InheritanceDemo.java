package training.day3;

class Emp
{
    int id;
    String name;
    float sal;
    Emp(){
        System.out.println("Parent constructor");
    }
    Emp(int id,String name,float sal)
    {
        this.id=id;
        this.name=name;
        this.sal=sal;

    }

    public String toString()
    {
        return id+"\t"+name+"\t"+sal;
    }
}

class WageEmp extends Emp
{
    int hrs,rate;
    WageEmp(){
        super();
        System.out.println("Child Constructor");
    };
    WageEmp(int id,String name,float sal,int hrs,int rate)
    {
        super(id, name, sal);
        this.hrs=hrs;
        this.rate=rate;
    }
    public void computeSal()
    {
        sal=rate*hrs;
    }

    public String toString()
    {
        return super.toString();
    }



}
public class InheritanceDemo {
    public static void main(String[] args) {
        WageEmp we=new WageEmp(1,"Alexa",0.0f,200,350);
        we.computeSal();
        System.out.println(we);
    }
}

