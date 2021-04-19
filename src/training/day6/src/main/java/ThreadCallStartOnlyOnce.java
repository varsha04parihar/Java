class ThreadStart extends Thread{
    public void run() {
        System.out.println("Thread is Started");

    }
}

public class ThreadCallStartOnlyOnce {
    public static void main(String[] args) {
        ThreadStart t=new ThreadStart();
        t.start();
        t.start();//will throw exception
        //Illegal Thread Exception a thread can start only onces
    }
}
