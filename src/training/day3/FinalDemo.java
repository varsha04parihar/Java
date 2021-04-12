package training.day3;
class Stud
{
    int id;
    String name;
    float per;
    final String coursenm="java";//final variable
    final String cnm;//final blank variable
    final static String counm;//final static blank variable
    static
    {
        counm="java_core";
    }
    Stud(int id,String name,float per)
    {
        this.id=id;
        this.name=name;
        this.per=per;
        cnm="java Training";
    }

    Stud() {
        cnm = "java Training";
    }

    public String toString()
    {
        return id+"\t"+name+"\t"+per+"\t"+cnm+"\t"+counm+"\t"+coursenm;
    }
}
public class FinalDemo {
    public static void main(String[] args) {
        Stud s=new Stud(1,"ABC",22000.89f);
        System.out.println(s);
    }
}
