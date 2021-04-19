class Account
{
    int actBal;
    Account(int actBal)
    {
        this.actBal=actBal;
    }
    synchronized public void deposit(int dbal)
    {
        System.out.println("Going to deposit !!!");
        actBal=actBal+dbal;
        System.out.println("Deposit complete \n Balance after deposit:"+actBal);
        notify();
    }
    synchronized public void withDraw(int wbal)
    {
        System.out.println("Going to withdraw !!!");
        if(wbal>actBal)
        {
            System.out.println("Less balance ....waiting for deposit");
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
            actBal=actBal=wbal;
            System.out.println("Withdraw complete !!! \n Balance after withdraw :"+actBal);
        }
    }
}
public class InterThreadCommunication {
    public static void main(String[] args) {
         final Account a=new Account(50000);

        //there is no extend for thread
        //creating anonymous class
        Thread t1=new Thread()
        {
            public void run()
            {
                a.withDraw(70000);
            }
        };
        Thread t2=new Thread()
        {
            public void run()
            {
                a.deposit(40000);
            }
        };
        t1.start();
        t2.start();
    }
}
