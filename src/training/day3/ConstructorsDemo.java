package training.day3;
class Demo1{
    public Demo1(){

    }
}

class Demo2{
    public Demo2(int x, int y){

    }
}

class Demo3{
    int a, b,c,d;

    public Demo3(int a, int b, int c, int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Demo3(Demo3 obj){
        this.a = obj.a;
        this.b = obj.b;
        this.c = obj.c;
        this.d = obj.d;
    }
    public String toString()
    {
        return a+"\t"+b+"\t"+c+"\t"+d;
    }
}

public class ConstructorsDemo {
    public static void main(String[] args) {


    Demo1 obj1 = new Demo1();

    Demo2 obj2 = new Demo2(10,20);

    Demo3 obj3 = new Demo3(10,20,30,40);
    Demo3 demo3obj2 = new Demo3(obj3);
    System.out.println(demo3obj2);
}
}