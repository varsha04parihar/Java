class ThreadDemo1 extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println(i*20+"\t"+Thread.currentThread().getName()
            +"\t"+Thread.currentThread().getPriority());
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
public class ThreadPriorityAndJoin {
    public static void main(String[] args)
    {
        ThreadDemo1 t1=new ThreadDemo1();
        ThreadDemo1 t2=new ThreadDemo1();
        ThreadDemo1 t3=new ThreadDemo1();
        t1.setName("1st Thread");
        t2.setName("2nd Thread");
        t3.setName("3rd Thread");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(7);
        t3.setPriority(Thread.MAX_PRIORITY);

        t2.start();
        try {
            t2.join();//if we apply join() to the thread the cpu will continue the execution of the
            //thread until it terminates and CPU will remain idle and will wait for the same thread to
            //come back in ready queue and continue the execution again
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        t1.start();
        t3.start();


    }
}
