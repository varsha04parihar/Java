class ThreadClass1 extends Thread
{
    public void run() {
        System.out.println("Thread 1 in Running state");
    }
}
class ThreadClass2 implements Runnable
{
    public void run() {
        System.out.println("Thread 2 in Running state");
    }
}
public class ThreadDemo {
    public static void main(String[] args)
    {
        ThreadClass1 t1=new
                ThreadClass1();
        ThreadClass2 t2=new ThreadClass2();
        Thread t=new
                Thread(t2);
        t1.start();
        t.start();

    }
}
