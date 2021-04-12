package training.day3;

class Employee{
    public int id;
    public String ename;
    public String desgn;
    public String addr;
    public String dept;


    public Employee(int id,String ename, String desgn , String addr, String dept){
       this.id=id;
       this.ename=ename;
       this.desgn=desgn;
       this.addr=addr;
       this.dept=dept;
    }

    public Employee(Employee emp, String dept){
        this.id=emp.id;
        this.ename=emp.ename;
        this.desgn= emp.desgn;
        this.addr= emp.addr;
        this.dept=dept;


    }
    public String toString()
    {
        return id+"\t"+ename+"\t"+desgn+"\t"+addr+"\t"+dept;
    }
}

public class ObjInConstructor {
    public static void main(String[] args) {
        Employee emp1=new Employee(1,"ABC","Manager","Pune","Hr");
        Employee emp2=new Employee(emp1,"IT");
        System.out.println(emp1);
        System.out.println(emp2);

    }
}
