class SecondThread implements Runnable
{
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println(i*5+"\t"+Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
public class ThreadUsingRunnableInterface {
    public static void main(String[] args) {
        SecondThread s1=new SecondThread();
        SecondThread s2=new SecondThread();
        Thread t1=new Thread(s1);
        Thread t2=new Thread(s2);
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t1.start();
        t2.start();
    }
}
