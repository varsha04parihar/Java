class Employee
{
    private int id;
    private String name;
    private float sal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSal() {
        return sal;
    }

    public void setSal(float sal) {
        this.sal = sal;
    }
}

public class EncapsulationDemo
{
    public static void main(String[] args) {
        Employee e=new Employee();
        e.setId(1);
        e.setName("ABC");
        e.setSal(67000.89f);
        System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
    }
}
