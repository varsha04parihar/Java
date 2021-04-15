class FirstThread extends Thread
{
    public void run()//start() will implicitly call run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i*20+"\t"+Thread.currentThread().getName());
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

public class ThreadUsingExtendDemo {

    public static void main(String[] args) {
        FirstThread t1=new
                FirstThread();
        FirstThread t2=new FirstThread();
       t1.setName("Thread 1");
       t2.setName("Thread 2");
       t1.start();
       t2.start();

    }}