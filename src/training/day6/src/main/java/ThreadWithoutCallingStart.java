class ThreadExample extends Thread
{
    public void run()
    {
        for (int i=0;i<5;i++){
            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
public class ThreadWithoutCallingStart {
    public static void main(String[] args) {
        ThreadExample t1=new ThreadExample();
        ThreadExample t2=new ThreadExample();
        t1.run();
        t2.run();
        //if we call run() directly it will be treated as normal object and not thread
    }
}
