package training.day3;
class Student{
    public int id;
    public String name;
    public String email;

    public Student(){

    }

    public Student(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }
    public String toString()
    {
        return id+"\t"+name+"\t"+email;
    }
}
public class ConstructorOverload {
    public static void main(String[] args) {
        Student student = new Student(10, "Jackson", "jack@gmail.com");

        Student student1 = new Student();
        student1.id = 20;
        student1.name = "Jennie";
        student1.email = "jennie@gmail.com";

        System.out.println(student);
        System.out.println(student1);
    }
}
