/*
* Thread synchronization will allow only 1 thread to access the shared resource simultaneously
* we can achieve synchronization by using synchronize method and synchronize block
* */
class PrintTable
{
    //shared resource
    synchronized public static void table(int no)
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println(i*no);
            try
            {
                Thread.sleep(3000);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}

class MyThreadOne extends Thread
{
    PrintTable t;//reference
    MyThreadOne(PrintTable t)
    {
        this.t=t;//object
    }
    public void run()
    {
        t.table(7);
    }
}

class  MyThreadTwo extends Thread
{
    PrintTable t;
    MyThreadTwo(PrintTable t)
    {
        this.t=t;
    }
    public void run()
    {
        t.table(9);
    }
}
public class ThreadSynchronizationDemo
{
    public static void main(String[] args)
    {
        PrintTable t=new PrintTable();
        MyThreadOne t1=new MyThreadOne(t);
        MyThreadTwo t2=new MyThreadTwo(t);
        t1.start();
        t2.start();

    }
}
